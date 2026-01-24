package org.example;

import jakarta.persistence.*;


@Entity
public class Member {

    @Id
    private String username;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    protected Member() {} // JPA 기본 생성자

    public Member(String username, Team team) {
        this.username = username;
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public String getUsername() {
        return username;
    }
}

//@Entity
//public class Member {
//
//    @Id
//    private String username;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    protected Member() {} // JPA 기본 생성자
//
//    public Member(String username, Team team) {
//        this.username = username;
//        this.team = team;
//    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//}
