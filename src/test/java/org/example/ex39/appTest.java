package org.example.ex39;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    // couldn't figure out how to test main

    void fillList(ArrayList<HashMap<Integer, String>> employees) {

        // initialize each hashmap
        HashMap<Integer, String> Johnson = new HashMap<Integer, String>();
        HashMap<Integer, String> Xiong = new HashMap<Integer, String>();
        HashMap<Integer, String> Michaelson = new HashMap<Integer, String>();
        HashMap<Integer, String> Jacobson = new HashMap<Integer, String>();
        HashMap<Integer, String> Jackson = new HashMap<Integer, String>();
        HashMap<Integer, String> Webber = new HashMap<Integer, String>();

        // fill hashmaps with their values
        Johnson.put(1, "John"); Johnson.put(2, "Johnson"); Johnson.put(3, "Manager"); Johnson.put(4, "2016-12-31");
        Xiong.put(1, "Tou"); Xiong.put(2, "Xiong"); Xiong.put(3, "Software Engineer"); Xiong.put(4, "2016-10-05");
        Michaelson.put(1, "Michael"); Michaelson.put(2, "Michaelson"); Michaelson.put(3, "District Manager"); Michaelson.put(4, "2015-12-19");
        Jacobson.put(1, "Jake"); Jacobson.put(2, "Jacobson"); Jacobson.put(3, "Programmer"); Jacobson.put(4, "");
        Jackson.put(1, "Jacquelyn"); Jackson.put(2, "Jackson"); Jackson.put(3, "DBA"); Jackson.put(4, "");
        Webber.put(1, "Sally"); Webber.put(2, "Webber"); Webber.put(3, "Web Developer"); Webber.put(4, "2015-12-18");

        // add each hash map to employees list
        employees.add(Johnson);
        employees.add(Xiong);
        employees.add(Michaelson);
        employees.add(Jacobson);
        employees.add(Jackson);
        employees.add(Webber);
    }

    @Test
    @DisplayName("testSortList and print")
    void sortList() {

        ArrayList<HashMap<Integer, String>> employees = new ArrayList<HashMap<Integer, String>>();

        fillList(employees);

        app.printOutput(app.sortList(employees), employees);
    }

    @Test
    @DisplayName("testPrintOutput again")
    void printOutput() {

        ArrayList<HashMap<Integer, String>> employees = new ArrayList<HashMap<Integer, String>>();

        fillList(employees);

        String[] order = new String[] {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

        app.printOutput(order, employees);


    }
}