/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex27;

import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // pass to validateInput with gets as variables
        validateInput(getFirst(), getLast(), getZip(), getID());
    }

    // gets firstname
    public static String getFirst() {

        // prompt for input, scan input, return input
        System.out.print("Enter the first name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // gets lastname
    public static String getLast() {

        // prompt for input, scan input, return input
        System.out.print("Enter the last name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // gets zip
    public static String getZip() {

        // prompt for input, scan input, return input
        System.out.print("Enter the ZIP code: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // gets ID
    public static String getID() {

        // prompt for input, scan for input, return input
        System.out.print("Enter the Employee ID: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // checks if firstname is empty
    public static boolean validateFirstFilled (String firstName) {

        // return true or false based off function
        return firstName.equals("");
    }

    // checks if lastname is empty
    public static boolean validateLastFilled (String lastName) {

        // return true or false based off function
        return lastName.equals("");
    }

    // checks if firstname is 2 or more characters
    public static boolean validateFirstLength (String firstName) {

        // return true or false based off operation
        return firstName.length() < 2;
    }

    // checks if lastname is 2 or more characters
    public static boolean validateLastLength (String lastName) {

        // returns true or false based off operation
        return lastName.length() < 2;
    }

    // checks if ID is in format
    public static boolean validateEmployeeID (String ID) {

        // nested ifs testing each requirement for ID format
        if (ID.length() == 7)
            if (Character.isLetter(ID.charAt(0)) && Character.isLetter(ID.charAt(1)))
                if (ID.charAt(2) == '-')
                    if (Character.isDigit(ID.charAt(3)) && Character.isDigit(ID.charAt(4))
                            && Character.isDigit(ID.charAt(5)) && Character.isDigit(ID.charAt(6)))
                        return false; // return false if fits format

        return true; // return true if does not fit format

    }

    // checks if zip fits format
    public static boolean validateZip (String Zip) {

        // checks if zip is 5 numbers and returns true if not
        if (Zip.length() != 5)
            return true;

        // runs through each char of zip
        for (int i = 0; i < Zip.length(); i++) {

            // checks if char at i is a letter and returns true if it is
            if (Character.isLetter(Zip.charAt(i)))
                return true;
        }

        return false; // return false as zip fits format
    }

    public static void validateInput (String firstName, String lastName, String Zip, String ID) {

        // set output to empty
        String output = "";

        // each if checks result of validates then updates input based off those results
        if (validateFirstLength(firstName))
            output = "The first name must be at least 2 characters long.\n";
        if (validateLastLength(lastName))
            output += "The last name must be at least 2 characters long.\n";
        if (validateFirstFilled(firstName))
            output += "The first name must be filled in.\n";
        if (validateLastFilled(lastName))
            output += "The last name must be filled in.\n";
        if (validateEmployeeID(ID))
            output += "The employee ID must be in the format of AA-1234.\n";
        if (validateZip(Zip))
            output += "The zipcode must be a 5 digit number.\n";
        if (output.equals(""))
            output = "There were no errors found.\n";

        // print output
        System.out.print(output);
    }
}
