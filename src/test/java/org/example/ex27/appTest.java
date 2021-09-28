package org.example.ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    @DisplayName("TestFirstFilled")
    void validateFirstFilled() {

        assertEquals(false, app.validateFirstFilled("Greg"));
        assertEquals(true, app.validateFirstFilled(""));
    }

    @Test
    @DisplayName("TestLastFilled")
    void validateLastFilled() {

        assertEquals(false, app.validateLastFilled("Greg"));
        assertEquals(true, app.validateLastFilled(""));
    }

    @Test
    @DisplayName("TestFirstLength")
    void validateFirstLength() {

        assertEquals(true, app.validateFirstLength("g"));
        assertEquals(false, app.validateFirstLength("Greg"));
    }

    @Test
    @DisplayName("TestLastLength")
    void validateLastLength() {

        assertEquals(true, app.validateLastLength("g"));
        assertEquals(false, app.validateLastLength("Greg"));
    }

    @Test
    @DisplayName("TestValidateEmployeeID")
    void validateEmployeeID() {

        assertEquals(true, app.validateEmployeeID("AAA-123"));
        assertEquals(false, app.validateEmployeeID("AA-1234"));
    }

    @Test
    @DisplayName("TestValidateZip")
    void validateZip() {

        assertEquals(true, app.validateZip("32ab45"));
        assertEquals(true, app.validateZip("32ab1"));
        assertEquals(false, app.validateZip("32572"));
    }

    @Test
    @DisplayName("testValidateInput")
    void validateInput() {

        app.validateInput("Greg", "Kennison", "32571", "AB-1234");
        app.validateInput("", "", "ab123", "CBJ-12");
    }
}