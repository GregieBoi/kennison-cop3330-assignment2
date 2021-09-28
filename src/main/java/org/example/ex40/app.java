/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        // initialize employees
        ArrayList<HashMap<Integer, String>> employees = new ArrayList<HashMap<Integer, String>>();

        // pass employees to fill list
        fillList(employees);

        // pass search and employees to printOutput
        printOutput(getSearch(), employees);
    }

    // fills list with hash tables and their hashtable values
    public static void fillList(ArrayList<HashMap<Integer, String>> employees) {

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

    // obtains search input
    public static String getSearch() {

        // prompt for input, scan input, return input
        System.out.print("Enter a search string: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // prints sorted output
    public static void printOutput(String search, ArrayList<HashMap<Integer, String>> employees) {

        Integer[] results = getResults(search, employees);

        // print header
        System.out.println("\nResults:\n\n" +
                "Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");

        // initalize counter
        int counter = 0;

        // enter nested for loops
        for (int i = 0; i < employees.size(); i++) {

            // enter nested ifs
            if (counter < results.length)
                if (i == results[counter]) {
                    // print output in format and update counter
                    System.out.format("%-20s| %-18s| %-15s\n", (employees.get(i).get(1) + " " + employees.get(i).get(2)),
                            employees.get(i).get(3), employees.get(i).get(4));
                    counter++;
                }
        }
    }

    // determines which hashmaps contain search and returns an integer array of their indexes
    public static Integer[] getResults(String search, ArrayList<HashMap<Integer, String>> employees) {

        // initialize counter
        int counter = 0;

        // enter for loop
        for (int i = 0; i < employees.size(); i++) {

            // check if any strings contain the search and update counter
            if ((employees.get(i).get(1).contains(search) || employees.get(i).get(1).equals(search)) ||
                    (employees.get(i).get(2).contains(search) || employees.get(i).get(2).equals(search)))
                counter++;
        }

        // initialize results array and reset counter
        Integer[] results = new Integer[counter];
        counter = 0;

        // enter for loop
        for (int i = 0; i < employees.size(); i++) {

            // check if hash contains search then add index to i and update counter
            if ((employees.get(i).get(1).contains(search) || employees.get(i).get(1).equals(search)) ||
                    (employees.get(i).get(2).contains(search) || employees.get(i).get(2).equals(search))) {
                results[counter] = i;
                counter++;
            }
        }

        // return results array
        return results;
    }

}
