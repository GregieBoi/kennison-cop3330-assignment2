/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex28;

import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize sum
        int sum = 0;

        // enter for loop
        for (int i = 0; i < 5; i++) {

            // prompt for input, scan input, add input to sum total
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            sum += input.nextInt();
        }

        // print output
        System.out.println("The total is " + sum + ".");
    }
}
