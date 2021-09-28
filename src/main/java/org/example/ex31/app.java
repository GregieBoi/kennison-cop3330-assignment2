/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex31;

import java.text.DecimalFormat;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // pass to calcHR
        getInput();
    }

    // gets input then passes to produce table
    public static void getInput() {

        // initialize flag and input variables
        int flag = 1;
        String resting = "", age = "";

        // enter while loop
        while (flag == 1) {

            // initialize scanner
            Scanner input = new Scanner(System.in);

            // prompt for input and store in resting
            System.out.print("Resting Pulse: ");
            resting = input.next();

            // prompt for input and store in age
            System.out.print("Age: ");
            age = input.next();

            // check if input is valid
            if (checkInput(resting, age)) {

                // if not valid continue to next iteration
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }

            // input is valid and exit while loop
            flag = 0;
        }

        // convert input to integers
        int restingInt = Integer.parseInt(resting), ageInt = Integer.parseInt(age);

        // pass converted input to produceTable
        produceTable(restingInt, ageInt);
    }

    // checks if input is valid
    public static boolean checkInput(String resting, String age) {

        // enter for loop for resting
        for (int i = 0; i < resting.length(); i++) {

            // check if character is not digit
            if (!Character.isDigit(resting.charAt(i)))
                return true; // return true for invalid input
        }

        // enter for loop for age
        for (int i = 0; i < age.length(); i++) {

            // check if character is not digit
            if (!Character.isDigit(age.charAt(i)))
                return true; // return true for invalid input
        }

        // return false as input is valid
        return false;
    }

    // calculates output and formats into table
    public static void produceTable(int resting, int age) {

        // calculate a constant so simplify later calculations
        int constant = (220 - age) - resting;

        // print out input and table header
        System.out.println("\nResting Pulse: " + resting + "\t\tAge: " + age);
        System.out.println("\nIntensity   | Rate\n" +
                           "------------|--------");

        // set formatting for numbers
        DecimalFormat df = new DecimalFormat("0");

        // enter for loop to produce table
        for (double i = 55; i < 96; i += 5) {

            // calculate targetHR for current i
            double targetHR = ((constant * i) / 100) + resting;

            // print output for current i in table format
            System.out.println(df.format(i) + "%\t\t\t| " + df.format(targetHR) + " BPM");

        }
    }
}
