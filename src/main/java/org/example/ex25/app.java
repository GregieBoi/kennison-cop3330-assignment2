/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex25;

import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize password using getpass
        String password = getpass();

        // pass to print_out and passwordValidator inside
        print_out(passwordValidator(password), password);
    }

    // scans through password and determines strength
    public static int passwordValidator(String password) {

        // initialize len
        int len = password.length();

        // password is less than 8 characters
        if (len < 8) {

            // initialize counter
            int counter = 0;

            // for loop to evaluate characters
            for (int i = 0; i < len; i++) {

                // if to up counter if there is letter
                if (Character.isLetter(password.charAt(i)))
                    counter++;
            }

            // if to determine if weak password and return corresponding int
            if (counter == len)
                return 2;

            // returns 1 for very weak
            return 1;
        }
        // password is 8 characters or longer
        else {

            // initialize counters for letters, digits, and special chars
            int chars = 0, digits = 0, special = 0;

            // for loop to initialize each character of string
            for (int i = 0; i < len; i++) {

                // char is letter
                if (Character.isLetter(password.charAt(i)))
                    chars++;
                // char is digit
                else if (Character.isDigit(password.charAt(i)))
                    digits++;
                // char is special
                else
                    special++;
            }

            // has letters and digits but no specials
            if (chars > 0 && digits > 0 && special == 0)
                // return 3 for strong
                return 3;
            // has letters, digits, and specials
            else if (chars > 0 && digits > 0 && special > 0)
                // return 4 for very strong
                return 4;

        }

        // return 1 as default
        return 1;
    }

    // returns string from input
    public static String getpass() {

        // prompts for input, scans in input, returns input
        System.out.print("Please enter the password: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // evaluates integer result and translates to string output
    public static void print_out(int result, String password) {

        // initialize result_str
        String result_str;

        // switch to convert to string
        switch (result) {
            case 1: // very weak
                result_str = "' is a very weak password.";
                break;
            case 2: // weak
                result_str = "' is a weak password.";
                break;
            case 3: // strong
                result_str = "' is a strong password.";
                break;
            case 4: // very strong
                result_str = "' is a very strong password.";
                break;
            default: // default
                result_str = "' is a very weak password.";
                break;
        }

        // print output
        System.out.println("The password '" + password + result_str);
    }
}
