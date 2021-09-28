package org.example.ex33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main/methods that require user input

    @Test
    @DisplayName("testEightBall")
    void eightBall() {

        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};

        app.eightBall(answers);
    }
}