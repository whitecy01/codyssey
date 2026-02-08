package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    protected Team() {}

    public Long getId() { return id; }
    public String getName() { return name; }
}
