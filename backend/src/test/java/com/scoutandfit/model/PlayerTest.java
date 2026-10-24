package com.scoutandfit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    void shouldCreatePlayerWithCorrectDetails() {

        Player player = new Player(
                1L,
                "Kevin De Bruyne",
                "Belgium"
        );

        assertEquals(1L, player.getId());
        assertEquals("Kevin De Bruyne", player.getName());
        assertEquals("Belgium", player.getNationality());
    }
}