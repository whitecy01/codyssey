package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamAllReation {
    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "teamAll")
    private List<MemberAllReation> members = new ArrayList<>();
}
