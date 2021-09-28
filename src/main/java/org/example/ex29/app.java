/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex29;

import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize rate and flag
        String rate = "";
        boolean flag = true;

        // enter while loop
        while (flag) {

            // prompt for input, scan input, store input in rate
            System.out.print("What is the rate of return? ");
            Scanner input = new Scanner(System.in);
            rate = input.next();

            flag = isValid(rate); // set flag to result of isValid
        }

        // convert rate to int and do calculations
        int rate_int = Integer.parseInt(rate);
        int double_in = 72 / rate_int;

        // print final output
        System.out.println("It will take " + double_in + " years to double your initial investment.");
    }

    // returns true or false depending on if rate is valid input
    public static boolean isValid(String rate) {

        // check if rate is 0
        if (rate.equals("0")) {

            // print output and return true to is valid
            System.out.println("Sorry. That's not a valid input.");
            return true;
        }

        // enter for loop
        for (int i = 0; i < rate.length(); i++) {

            // check if character is not a digit
            if (!Character.isDigit(rate.charAt(i))) {

                // print output and return true to isValid
                System.out.println("Sorry. That's not a valid input.");
                return true;
            }
        }

        // return false for isValid
        return false;
    }
}
