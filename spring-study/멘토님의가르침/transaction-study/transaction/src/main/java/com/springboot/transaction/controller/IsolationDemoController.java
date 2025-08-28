package com.springboot.transaction.controller;


import com.springboot.transaction.service.IsolationDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/iso")
public class IsolationDemoController {

    @Autowired
    private IsolationDemoService service;

    @GetMapping("/rc")
    public Map<String, Object> rc(@RequestParam String owner) {
        var p = service.readTwice_RC(owner);
        return Map.of("first", p.first(), "second", p.second(), "isolation", "READ_COMMITTED");
    }

    @GetMapping("/rr")
    public Map<String, Object> rr(@RequestParam String owner) {
        var p = service.readTwice_RR(owner);
        return Map.of("first", p.first(), "second", p.second(), "isolation", "REPEATABLE_READ");
    }

    @PostMapping("/deposit")
    public Map<String, Object> deposit(@RequestParam String owner, @RequestParam BigDecimal amount) {
        service.deposit(owner, amount);
        return Map.of("ok", true);
    }
}
