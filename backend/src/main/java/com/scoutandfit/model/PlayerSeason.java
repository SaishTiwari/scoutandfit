package com.scoutandfit.model;

public class PlayerSeason {

    private Long id;
    private Player player;
    private Team team;
    private Season season;

    public PlayerSeason(Long id, Player player, Team team, Season season) {
        this.id = id;
        this.player = player;
        this.team = team;
        this.season = season;
    }

    public Long getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }

    public Season getSeason() {
        return season;
    }
}