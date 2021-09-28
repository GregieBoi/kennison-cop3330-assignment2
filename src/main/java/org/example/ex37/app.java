/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // call fillList with getMin, getSpecial, and getNumbers
        fillList(getMin(), getSpecial(), getNumbers());
    }

    // gets min length
    public static int getMin() {

        // prompt for input, scan input, return input
        System.out.print("What's the minimum length? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // gets amount of special characters required
    public static int getSpecial() {

        // prompt for input, scan input, return input
        System.out.print("How many special characters? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // gets amount of numbers required
    public static int getNumbers() {

        // prompt for input, scan input, return input
        System.out.print("How many numbers? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // fills list with characters then generates password
    public static void fillList(int min, int special, int numbers) {

        // initialize rand and list
        Random rand = new Random();
        ArrayList<Character> characters = new ArrayList<Character>();

        // initialize length and strings
        int length = min + rand.nextInt(min);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbs = "0123456789";
        String specialChars = "!@#$%&";

        // enter for loop to select random letters
        for (int i = 0; i < length - (special + numbers); i++) {

            // add random letter to list
            characters.add(alphabet.charAt(rand.nextInt(52)));
        }

        // enter for loop to select random numbers
        for (int i = 0; i < numbers; i++) {

            // add random numbers to list
            characters.add(numbs.charAt(rand.nextInt(10)));
        }

        // enter for loop to select special characters
        for (int i = 0; i < special; i++) {

            // add random special character to list
            characters.add(specialChars.charAt(rand.nextInt(6)));
        }

        // initialize lengthIndex and sb
        int lengthIndex = length;
        StringBuilder sb = new StringBuilder(length);

        // enter for loop to build password
        for (int i = 0; i < length; i++) {

            // select random index for list
            int pickNum = rand.nextInt(lengthIndex);

            // add random character to sb
            sb.append(characters.get(pickNum));

            // remove used character from list and update lengthIndex
            characters.remove(pickNum);
            lengthIndex--;

        }

        // print output
        System.out.println("Your password is " + sb.toString());
    }
}
