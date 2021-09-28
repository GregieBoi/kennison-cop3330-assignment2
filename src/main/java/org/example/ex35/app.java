/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize list
        ArrayList<String> contestants = new ArrayList<String>();

        fillArrayList(contestants); // pass to fill list
        pickWinner(contestants); // pass to pickWinner
    }

    // fills list with input
    public static void fillArrayList(ArrayList<String> contestants) {

        // initialize flag
        boolean flag = true;

        // enter while loop
        while (flag) {

            // Prompt for input, scan input, set to name
            System.out.print("Enter a name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            // check if blank input
            if (name.equals("")) {
                break; // break out of while loop
            }

            // add name to list
            contestants.add(name);
        }
    }

    // determines winner randomly
    public static void pickWinner(ArrayList<String> contestants) {

        // initialize rand
        Random rand = new Random();

        // print output with randomly generated winner
        System.out.println("The winner is... " + contestants.get(rand.nextInt(contestants.size())));
    }
}
