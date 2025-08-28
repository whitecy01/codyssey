package com.springboot.transaction.service;

import com.springboot.transaction.dto.AccountDto;
import com.springboot.transaction.entity.Account;
import com.springboot.transaction.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransferService {

    @Autowired
    private AccountRepository accountRepository;

    /** Atomicity/Isolation를 체감하기 위한 계좌 이체 */
    @Transactional(isolation = Isolation.READ_COMMITTED) // 기본값 명시(학습용)
    public void transfer(String fromOwner, String toOwner, BigDecimal amount, boolean makeErrorAfterDeposit) {
        Account from = accountRepository.findByOwner(fromOwner)
                .orElseThrow(() -> new IllegalArgumentException("출금 계좌 없음: " + fromOwner));
        Account to = accountRepository.findByOwner(toOwner)
                .orElseThrow(() -> new IllegalArgumentException("입금 계좌 없음: " + toOwner));

        // 비즈니스 규칙(Consistency 보장의 일부)
        if (fromOwner.equals(toOwner)) throw new IllegalArgumentException("동일 계좌 이체 불가");

        from.withdraw(amount);
        to.deposit(amount);

        // 더티체킹으로 커밋 시점에 update 발생
        // 의도적으로 에러를 던져 롤백(원자성) 확인
        if (makeErrorAfterDeposit) {
            throw new RuntimeException("테스트용 강제 예외 → 전체 롤백되어야 함");
        }
    }

    @Transactional(readOnly = true)
    public List<AccountDto> findAllAccounts() {
        return accountRepository.findAll()
                .stream()
                .map(AccountDto::fromEntity) // Entity → DTO 변환
                .toList();
    }

    /** 테스트용 초기화 */
    @Transactional
    public void init(String aOwner, BigDecimal aBal, String bOwner, BigDecimal bBal) {
        accountRepository.findByOwner(aOwner).orElseGet(() ->
                accountRepository.save(new Account(aOwner, aBal)));

        accountRepository.findByOwner(bOwner).orElseGet(() ->
                accountRepository.save(new Account(bOwner, bBal)));
    }


}
