package com.scoutandfit.model;

public class Season {

    private Long id;
    private String name;
    private int startYear;
    private int endYear;

    public Season(Long id, String name, int startYear, int endYear) {
        this.id = id;
        this.name = name;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }
}