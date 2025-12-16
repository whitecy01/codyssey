package com.springboot.transaction.service;

import com.springboot.transaction.entity.Account;
import com.springboot.transaction.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class IsolationDemoService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private EntityManager em;

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }

    // ❶ READ COMMITTED: 커밋된 값이면 두 번째 읽기에서 보임 (Non-repeatable read 가능)
    @Transactional(isolation = Isolation.READ_COMMITTED, readOnly = true)
    public BalancePair readTwice_RC(String owner) {
        BigDecimal first = accountRepository.findByOwner(owner).orElseThrow().getBalance();
        sleep(3000);              // 이 사이에 다른 트랜잭션이 값 변경/커밋
        em.clear();               // 1차 캐시 비워서 DB로 다시 조회
        BigDecimal second = accountRepository.findByOwner(owner).orElseThrow().getBalance();
        return new BalancePair(first, second);
    }

    // ❷ REPEATABLE READ: 같은 트랜잭션 내에서는 같은 스냅샷 유지 → 두 번째도 같은 값
    @Transactional(isolation = Isolation.REPEATABLE_READ, readOnly = true)
    public BalancePair readTwice_RR(String owner) {
        BigDecimal first = accountRepository.findByOwner(owner).orElseThrow().getBalance();
        sleep(3000);
        em.clear();
        BigDecimal second = accountRepository.findByOwner(owner).orElseThrow().getBalance();
        return new BalancePair(first, second);
    }

    // ❸ 값 변경용(다른 트랜잭션에서 호출)
    @Transactional
    public void deposit(String owner, BigDecimal amount) {
        Account a = accountRepository.findByOwner(owner).orElseThrow();
        a.deposit(amount); // 커밋 시 UPDATE
    }

    public record BalancePair(BigDecimal first, BigDecimal second) {}
}