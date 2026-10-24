package com.scoutandfit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeasonTest {

    @Test
    void shouldCreateSeasonWithCorrectDetails() {

        Season season = new Season(
                1L,
                "2022-23",
                2022,
                2023
        );

        assertEquals(1L, season.getId());
        assertEquals("2022-23", season.getName());
        assertEquals(2022, season.getStartYear());
        assertEquals(2023, season.getEndYear());
    }
}