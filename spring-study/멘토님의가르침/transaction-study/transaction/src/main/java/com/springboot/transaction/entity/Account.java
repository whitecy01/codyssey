package com.springboot.transaction.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String owner;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Version
    private Long version; // 낙관적 락(동시성 안전을 조금 더 확보)

    public Long getId() { return id; }
    public String getOwner() { return owner; }
    public BigDecimal getBalance() { return balance; }
    public Long getVersion() { return version; }

    public void withdraw(BigDecimal amount) {
        if (amount.signum() <= 0) throw new IllegalArgumentException("amount must be positive");
        BigDecimal next = this.balance.subtract(amount); // 잔액 - 출금액
        if (next.signum() < 0) throw new IllegalStateException("잔액 부족");
        this.balance = next;
    }

    public void deposit(BigDecimal amount) {
        if (amount.signum() <= 0) throw new IllegalArgumentException("amount must be positive");
        this.balance = this.balance.add(amount);
    }

    protected Account() {}
    public Account(String owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }
}