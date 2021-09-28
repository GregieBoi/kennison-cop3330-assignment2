package org.example.ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    @DisplayName("TestPasswordValidator")
    void passwordValidator() {

        assertEquals(1, app.passwordValidator("12345"));
        assertEquals(2, app.passwordValidator("abcde"));
        assertEquals(3, app.passwordValidator("abc123xyz"));
        assertEquals(4, app.passwordValidator("1337h@xor!"));
    }

    @Test
    @DisplayName("testPrintOut")
    void printOut() {

        app.print_out(1, "12345");
        app.print_out(2, "abcde");
        app.print_out(3, "abc123xyz");
        app.print_out(4, "1337h@xor!");
    }
}