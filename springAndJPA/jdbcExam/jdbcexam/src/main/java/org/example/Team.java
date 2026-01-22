package org.example;

public class Team {

    private final Long id;
    private final String name;

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Team{id=" + id + ", name='" + name + "'}";
    }
}