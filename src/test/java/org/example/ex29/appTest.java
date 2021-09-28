package org.example.ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // could not learn how to simulate user input in test or run main

    @Test
    @DisplayName("testIsValid")
    void isValid() {

        assertEquals(true, app.isValid("abc"));
        assertEquals(true, app.isValid("0"));
        assertEquals(false, app.isValid("2"));
    }

}