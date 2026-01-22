package org.example;

import java.time.LocalDateTime;

public class Member {

    private final Long id;
    private final String name;
    private final Team team; // 🔥 연관관계

    public Member(Long id, String name, Team team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Team getTeam() { return team; }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}