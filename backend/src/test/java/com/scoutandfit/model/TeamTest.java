package com.scoutandfit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {

    @Test
    void shouldCreateTeamWithCorrectDetails() {

        Team team = new Team(
                1L,
                "Manchester City",
                "England"
        );

        assertEquals(1L, team.getId());
        assertEquals("Manchester City", team.getName());
        assertEquals("England", team.getCountry());
    }
}