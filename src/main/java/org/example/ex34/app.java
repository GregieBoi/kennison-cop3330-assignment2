/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize arraylist
        ArrayList<String> employees = new ArrayList<String>();

        fillArrayList(employees); // pass to fill arraylist
        printEmployees(employees); // pass to print
        removeEmployee(employees, getFired()); // pass to remove
        printEmployees(employees); // pass to print

        employees.clear(); // clear list
    }

    // fills array
    public static void fillArrayList(ArrayList<String> employees) {

        // add each employee
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }

    // prints arraylist
    public static void printEmployees(ArrayList<String> employees) {

        // print out how many employees there are
        System.out.println("There are " + employees.size() + " employees:");

        // enter for loop
        for (int i = 0; i < employees.size(); i++) {

            // print employee at i
            System.out.println(employees.get(i));
        }
    }

    // removes input from list
    public static void removeEmployee(ArrayList<String> employees, String fired) {

        System.out.println("");

        // enter for loop
        for (int i = 0; i < employees.size(); i++) {

            // check if fired matches employee at i
            if (fired.equals(employees.get(i)))
                employees.remove(i); // removes employee
        }
    }

    public static String getFired() {

        // prompt for input, scan in to fired, and print new line
        System.out.print("\nEnter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
