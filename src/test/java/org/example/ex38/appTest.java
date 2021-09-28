package org.example.ex38;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test functions that take in user input

    @Test
    @DisplayName("testFilterEvenNumbers")
    void filterEvenNumbers() {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] filtered = app.filterEvenNumbers(arr);

        for (int i = 0; i < filtered.length; i++)
            System.out.println(filtered[i]);
    }
}