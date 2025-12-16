package com.springboot.transaction.dto;


import com.springboot.transaction.entity.Account;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
public class AccountDto {
    private Long id;
    private String owner;
    private BigDecimal balance;
    public AccountDto() {} // 기본 생성자

    public AccountDto(Long id, String owner, BigDecimal balance) { // 모든 필드 생성자
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public String getOwner() { return owner; }
    public BigDecimal getBalance() { return balance; }

    // 엔티티 → DTO 변환
    public static AccountDto fromEntity(Account account) {
        return new AccountDto(
                account.getId(),
                account.getOwner(),
                account.getBalance()
        );
    }
}
