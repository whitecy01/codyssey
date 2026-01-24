package com.persistenceContext.persistenceContextexam;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;

    protected Member() {}
    public Member(String name) { this.name = name; }
}
