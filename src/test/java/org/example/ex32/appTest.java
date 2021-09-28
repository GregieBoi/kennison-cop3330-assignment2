package org.example.ex32;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main/methods that require user input

    @Test
    @DisplayName("testCheckIfValidDiff")
    void checkIfValidDiff() {

        assertEquals(true, app.checkIfValidDiff("4"));
        assertEquals(true, app.checkIfValidDiff("abc"));
        assertEquals(false, app.checkIfValidDiff("1"));
    }

    @Test
    @DisplayName("testCheckIfValidGuess")
    void checkIfValidGuess() {

        assertEquals(true, app.checkIfValidGuess(""));
        assertEquals(true, app.checkIfValidGuess("abc"));
        assertEquals(false, app.checkIfValidGuess("1"));
    }
}