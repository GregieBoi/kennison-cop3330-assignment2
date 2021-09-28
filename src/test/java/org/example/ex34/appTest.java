package org.example.ex34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    @DisplayName("testFillArrayList and printEmployees")
    void fillArrayListAndPrint() {

        ArrayList<String> employees = new ArrayList<String>();

        app.fillArrayList(employees);

        app.printEmployees(employees);
    }

    @Test
    @DisplayName("testRemoveEmployee(and fill and print again)")
    void removeEmployee() {

        ArrayList<String> employees = new ArrayList<String>();

        app.fillArrayList(employees);

        app.removeEmployee(employees, "Chris Jones");

        app.printEmployees(employees);
    }
}