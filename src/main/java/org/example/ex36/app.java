/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize list
        ArrayList<Integer> data = new ArrayList<Integer>();

        fillList(data); // pass to fillList
        printList(data); // pass to printList
        double avg = average(data); // initialize avg with average
        int minimum = min(data); // initialize minimum with min
        int maximum = max(data); // initialize maximum with max
        double standardDV = std(data, avg); // initialize standardDV with std
        printOutput(avg, minimum, maximum, standardDV); // pass to printOutput
    }

    // fills list
    public static void fillList(ArrayList<Integer> data) {

        // set flag to true
        boolean flag = true;

        // enter while loop
        while (flag) {

            // Prompt for input, scan input, set to num
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            String num = input.nextLine();

            // break if input is "done"
            if (num.equals("done"))
                break;

            // check if input is valid
            if (isValid(num)) {

                int number = Integer.parseInt(num); // convert num to integer
                data.add(number); // add num to list
            }
        }
    }

    // checks if input is valid
    public static boolean isValid(String num) {

        // check if empty
        if (num.equals("")) {

            // prints not valid and return false
            System.out.println("Sorry. That's not valid input");
            return false;
        }

        // enter for loop
        for (int i = 0; i < num.length(); i++) {

            // check if character is not a digit
            if (!Character.isDigit(num.charAt(i))) {

                // prints not valid and returns false
                System.out.println("Sorry. That's not valid input");
                return false;
            }
        }

        // return true for valid
        return true;
    }

    // prints list
    public static void printList(ArrayList<Integer> data) {

        // print beginning of list
        System.out.print("Numbers: ");

        // enter for loop
        for (int i = 0; i < data.size(); i++) {

            // check if last number
            if (i == data.size() - 1)
                System.out.print(data.get(i)); // prints number at i
            else
                System.out.print(data.get(i) + ", "); // prints number at i
        }
        // print new line
        System.out.println("");
    }

    // calculates average
    public static double average(ArrayList<Integer> data) {

        // initialize variables
        double sum = 0;
        double size = data.size();

        // enter for loop
        for (int i = 0; i < size; i++) {

            // update sum
            sum += data.get(i);
        }

        // return avg
        return sum / size;
    }

    // determines min
    public static int min(ArrayList<Integer> data) {

        // initialize minimum
        int minimum = data.get(0);

        // enter for loop
        for (int i = 1; i < data.size(); i++)
            // if min is bigger than current val set min to current val
            if (minimum > data.get(i))
                minimum = data.get(i);

        // return min
        return minimum;
    }

    // determines max
    public static int max(ArrayList<Integer> data) {

        // initialize max
        int maximum = data.get(0);

        // enter for loop
        for (int i = 1; i < data.size(); i++)
            // if max is smaller than current value set min to current value
            if (maximum < data.get(i))
                maximum = data.get(i);

        // return max
        return maximum;
    }

    // calculates std
    public static double std(ArrayList<Integer> data, double avg) {

        // initialize summation
        double summation = 0;

        // enter for loop
        for (int i = 0; i < data.size(); i++)
            // update summation
            summation += Math.pow(data.get(i) - avg, 2);

        // calculate mean
        double mean = summation / data.size();

        // return calculated std
        return Math.sqrt(mean);

    }

    // prints output in format
    public static void printOutput(double avg, int minimum, int maximum, double standardDV) {

        // set formatting modes
        DecimalFormat dfAVG = new DecimalFormat("0.0");
        DecimalFormat dfSTD = new DecimalFormat("0.##");

        // print output
        System.out.println("The average is " + dfAVG.format(avg) +
                "\nThe minimum is " + minimum +
                "\nThe maximum is " + maximum +
                "\nThe standard deviation is " + dfSTD.format(standardDV));
    }
}
