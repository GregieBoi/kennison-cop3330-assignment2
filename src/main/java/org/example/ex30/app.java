/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex30;

public class app {

    public static void main(String[] args) {

        // enter nested for loops
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {

                // calculate curNum
                int curNum = i * j;

                // enter if else statements to determine formatting
                if (curNum < 10)
                    System.out.printf("  %d   ", curNum); // print for a single digit
                else if (curNum < 100)
                    System.out.printf(" %d   ", curNum); // print for double digit
                else
                    System.out.printf("%d   ", curNum); // print for triple digit
            }

            System.out.println(""); // print new line
        }
    }
}
