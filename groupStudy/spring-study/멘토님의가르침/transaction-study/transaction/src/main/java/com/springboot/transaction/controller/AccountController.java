package com.springboot.transaction.controller;

import com.springboot.transaction.dto.AccountDto;
import com.springboot.transaction.entity.Account;
import com.springboot.transaction.repository.AccountRepository;
import com.springboot.transaction.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransferService transferService;


    @PostMapping("/init")
    public ResponseEntity<?> init() {
        transferService.init("alice", new BigDecimal("100000"), "bob", new BigDecimal("50000"));
        return ResponseEntity.ok(Map.of("ok", true));
    }

    @GetMapping("/select")
    public List<AccountDto> list() {
        return transferService.findAllAccounts();
    }

    @PostMapping("/transfer")
    public ResponseEntity<?> transfer(@RequestBody TransferRequest req) {
        transferService.transfer(req.from(), req.to(), req.amount(), req.makeError());
        return ResponseEntity.ok(Map.of("ok", true));
    }

    public record TransferRequest(String from, String to, BigDecimal amount, boolean makeError) {}
}
