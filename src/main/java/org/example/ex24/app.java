/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex24;

import java.util.Arrays;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // print initial input prompt
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        // variables declarations
        String str1 = get_word_1();
        String str2 = get_word_2();

        // if else to determine output
        if (isAnagram(str1, str2))
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        else
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
    }

    // gets first word
    public static String get_word_1() {

        // print input prompt, scan for input, and return string
        System.out.print("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // gets second word
    public static String get_word_2() {

        // print input prompt, scan for input, and return string
        System.out.print("Enter the second string: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // determines if anagrams
    public static boolean isAnagram(String string1, String string2) {

        // if else to see if strings are same lengh
        if (string1.length() == string2.length()) {

            // converts strings to character arrays
            char carray1[] = string1.toCharArray();
            char carray2[] = string2.toCharArray();

            // sorts character arrays
            Arrays.sort(carray1);
            Arrays.sort(carray2);

            // for loop to compare sorted character arrays
            for (int i = 0; i < string1.length(); i++) {

                // if to determine if characters are the same
                if (carray1[i] != carray2[i])
                    // returns false if characters are not the same
                    return false;
            }
            // returns true as all characters are the same
            return true;
        }
        // returns false as strings are not the same length
        return false;
    }
}

