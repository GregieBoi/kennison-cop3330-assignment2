package org.example.ex24;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class appTest extends TestCase {

    // couldn't figure out how to test main/methods that require user input

    @Test
    @DisplayName("testIsAnagram")
    public void testIsAnagram() {

        String string1 = "tone", string2 = "note", string3 = "not";

        assertEquals(true, app.isAnagram(string1, string2));

        assertEquals(false, app.isAnagram(string2, string3));


    }
}