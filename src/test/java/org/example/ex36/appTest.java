package org.example.ex36;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main/methods that require user input

    void fillList(ArrayList<Integer> data) {

        data.add(100);
        data.add(200);
        data.add(300);
        data.add(1000);
    }

    @Test
    @DisplayName("testIsValid")
    void isValid() {

        assertEquals(true, app.isValid("100"));
        assertEquals(false, app.isValid("three"));
        assertEquals(false, app.isValid(""));
    }

    @Test
    @DisplayName("testPrintList")
    void printList() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        app.printList(data);
    }

    @Test
    @DisplayName("testAverage")
    void average() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        assertEquals(400, app.average(data));
    }

    @Test
    @DisplayName("testMin")
    void min() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        assertEquals(100, app.min(data));
    }

    @Test
    @DisplayName("testMax")
    void max() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        assertEquals(1000, app.max(data));
    }

    @Test
    @DisplayName("testSTD")
    void std() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        DecimalFormat df = new DecimalFormat("0.00");

        assertEquals("353.55", df.format(app.std(data, app.average(data))));
    }

    @Test
    @DisplayName("testPrintOutput")
    void printOutput() {

        ArrayList<Integer> data = new ArrayList<Integer>();
        fillList(data);

        app.printOutput(app.average(data), app.min(data), app.max(data), app.std(data, app.average(data)));
    }
}