package org.example.ex31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't learn how to test main/methods that require user input

    @Test
    @DisplayName("testCheckInput")
    void checkInput() {

        assertEquals(true, app.checkInput("abc", "def"));
        assertEquals(true, app.checkInput("abc", "12"));
        assertEquals(true, app.checkInput("65", "def"));
        assertEquals(false, app.checkInput("65", "22"));
    }

    @Test
    @DisplayName("testProduceTable")
    void produceTable() {

        app.produceTable(65, 22);
    }
}