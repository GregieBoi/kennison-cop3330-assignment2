/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex38;

import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize the filtered array
        int[] filtered = filterEvenNumbers(generateArray());

        // print beginning of output statement
        System.out.print("The even numbers are");

        // enter for loop for output
        for (int i = 0; i < filtered.length; i++)
            System.out.print(" " + filtered[i]);
        System.out.println(".");


    }

    // gathers input and generates the initial array
    public static int[] generateArray() {

        // prompt for input, scan input, store in numbers, convert to string array, and initialize intArr
        System.out.print("Enter a list of numbers, separated by spaces: ");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] numbersArr = numbers.split(" ");
        int[] intArr = new int[numbersArr.length];

        // convert str array to int array
        for (int i = 0; i < numbersArr.length; i++)
            intArr[i] = Integer.parseInt(numbersArr[i]);

        // return intArr
        return intArr;
    }

    // filters even numbers
    public static int[] filterEvenNumbers(int[] oldArr) {

        // initialize filterCT
        int filterCT = 0;

        // enter for loop and update filterCT to amount of even nums
        for (int i = 0; i < oldArr.length; i++)
            if (oldArr[i] % 2 == 0)
                filterCT++;

        // initialize filteredArr and reset filterCT
        int[] filteredArr = new int[filterCT];
        filterCT = 0;

        // enter for loop and if number is even add to filteredArr
        for (int i = 0; i < oldArr.length; i++)
            if (oldArr[i] % 2 == 0) {
                filteredArr[filterCT] = oldArr[i];
                filterCT++;
            }

        // return filteredArr
        return filteredArr;
    }
}
