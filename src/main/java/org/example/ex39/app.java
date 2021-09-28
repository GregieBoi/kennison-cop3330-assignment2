/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex39;

import java.util.ArrayList;
import java.util.HashMap;

public class app {

    // main
    public static void main(String[] args) {

        // initialize employees
        ArrayList<HashMap<Integer, String>> employees = new ArrayList<HashMap<Integer, String>>();

        // pass employees to fill list
        fillList(employees);

        // initialize sortedNames
        String[] sortedNames = sortList(employees);

        // pass sortedNames and employees to printOutput
        printOutput(sortedNames, employees);
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

    // takes in list and employees and returns sorted last names in string arr
    public static String[] sortList(ArrayList<HashMap<Integer, String>> employees) {

        // initialize lastNames array
        String[] lastNames = new String[employees.size()];

        // fill lastNames array with last names
        for (int i = 0; i < employees.size(); i++) {

            // set lastNames at i to corresponding hashmap lastname
            lastNames[i] = employees.get(i).get(2);
        }

        // initialize temp
        String temp = "";

        // enter nested for loops
        for (int i = 0; i < lastNames.length; i++) {
            for (int j = i + 1; j < lastNames.length; j++) {

                // to compare one string with other strings
                if (lastNames[i].compareTo(lastNames[j]) > 0) {
                    // swapping
                    temp = lastNames[i];
                    lastNames[i] = lastNames[j];
                    lastNames[j] = temp;
                }
            }
        }

        // return sorted last names array
        return lastNames;
    }

    // prints sorted output
    public static void printOutput(String[] lastNames, ArrayList<HashMap<Integer, String>> employees) {

        // print header
        System.out.println("Name                | Position          | Separation Date\n" +
                           "--------------------|-------------------|----------------");

        // enter nested for loops
        for (int i = 0; i < lastNames.length; i++) {
            for (int j = 0; j < lastNames.length; j++) {

                // if lastNames at index i is same as employees at j print output
                if (lastNames[i].equals(employees.get(j).get(2)))
                    System.out.format("%-20s| %-18s| %-15s\n", (employees.get(j).get(1) + " " + employees.get(j).get(2)),
                            employees.get(j).get(3), employees.get(j).get(4));
            }
        }
    }
}

