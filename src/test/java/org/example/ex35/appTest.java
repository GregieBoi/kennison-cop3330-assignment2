package org.example.ex35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main/methods that required user input

    // fills contestants with preset values
    void createTestList(ArrayList<String> contestants) {

        contestants.add("Homer");
        contestants.add("Lisa");
        contestants.add("Maggie");
        contestants.add("Bart");
        contestants.add("Marge");
    }

    @Test
    @DisplayName("testPickWinner")
    void pickWinner() {

        ArrayList<String> contestants = new ArrayList<String>();
        createTestList(contestants);
        app.pickWinner(contestants);
    }
}