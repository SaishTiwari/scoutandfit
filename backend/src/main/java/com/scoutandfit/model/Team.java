package com.scoutandfit.model;

public class Team {

    private Long id;
    private String name;
    private String country;

    public Team(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}