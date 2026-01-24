package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {

    @Id
    private String name;

    protected Team() {} // JPA 기본 생성자

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}