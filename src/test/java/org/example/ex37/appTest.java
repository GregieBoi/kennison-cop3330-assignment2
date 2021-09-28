package org.example.ex37;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main/methods that require user input

    @Test
    @DisplayName("testFillList")
    void fillList() {

        app.fillList(8, 2, 2);
    }
}