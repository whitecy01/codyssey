package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID") // MEMBER.TEAM_ID (FK)
    private Team team;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    public Member() {}

    public void create(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() { return id; }
    public Team getTeam() { return team; }
    public String getName() { return name; }
    public Integer getAge() { return age; }
}
