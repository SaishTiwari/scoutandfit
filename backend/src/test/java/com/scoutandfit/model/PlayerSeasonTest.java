package com.scoutandfit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerSeasonTest {

    @Test
    void shouldConnectPlayerTeamAndSeason() {

        // Create a player
        Player player = new Player(
                1L,
                "Kevin De Bruyne",
                "Belgium"
        );

        // Create a team
        Team team = new Team(
                1L,
                "Manchester City",
                "England"
        );

        // Create a season
        Season season = new Season(
                1L,
                "2022-23",
                2022,
                2023
        );

        // Connect them
        PlayerSeason playerSeason = new PlayerSeason(
                1L,
                player,
                team,
                season
        );

        // Verify the association
        assertEquals(1L, playerSeason.getId());
        assertSame(player, playerSeason.getPlayer());
        assertSame(team, playerSeason.getTeam());
        assertSame(season, playerSeason.getSeason());
    }
}