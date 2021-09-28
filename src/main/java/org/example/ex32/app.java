/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex32;

import java.util.Random;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // print initial prompt
        System.out.println("Let's play Guess the Number!\n");

        // pass to difficultySelect
        difficultySelect();
    }

    // determines difficulty and passes to guessingGame
    public static void difficultySelect() {

        // initialize flag, scanner, and diff
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        String diff = "";

        // while until diff is valid selection
        while (flag) {

            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            diff = input.next();
            flag = checkIfValidDiff(diff);
        }

        // convert to diff to integer and pass to guessingGame
        int difficulty = Integer.parseInt(diff);
        guessingGame(difficulty);
    }

    // checks if difficulty is 1 2 or 3
    public static boolean checkIfValidDiff(String input) {

        // returns false if 1 2 or 3
        if (input.equals("1") || input.equals("2") || input.equals("3"))
            return false;

        // print invalid statement and return true if anything else
        System.out.println("Sorry. That's not a valid input.");
        return true;
    }

    // runs the actual game
    public static void guessingGame(int difficulty) {

        // initialize variables
        int randNum = 0, upperbound = 0;
        Random rand = new Random();

        // determine difficulty and create rand in proper bounds
        switch (difficulty) {

            case 1: // set rand to 1-10
                upperbound = 10;
                randNum = rand.nextInt(upperbound) + 1;
                break;

            case 2: // set rand to 1-100
                upperbound = 100;
                randNum = rand.nextInt(upperbound) + 1;
                break;

            case 3: // set rand to 1-1000
                upperbound = 1000;
                randNum = rand.nextInt(upperbound) + 1;
                break;

            default: // should never happen, but set rand to 0-1
                randNum = rand.nextInt(upperbound) + 1;
                break;
        }

        // initialize counter, guessNum, and guess
        int counter = 0, guessNum = 0;
        String guess = "0";

        // enter while loop
        while (guessNum != randNum) {

            // initialize scanner
            Scanner input = new Scanner(System.in);

            // if counter is zero
            if (counter == 0) {

                // prompt for first input, scan input to guess, up counter, and convert guess to int
                System.out.print("I have my number. What's your guess? ");
                guess = input.next();
                counter++;
                guessNum = Integer.parseInt(guess);

                // continue;
            }

            // if guess is not valid
            if (checkIfValidGuess(guess) || guessNum < 1) {

                // prompt for new input, scan input to guess, up counter, and convert to int
                System.out.print("Sorry. That's not valid input. Guess again: ");
                guess = input.next();
                counter++;
                guessNum = Integer.parseInt(guess);
            }
            // if guess is too high
            else if (guessNum > randNum) {

                // prompt for new input, scan input to guess, up counter, and convert to int
                System.out.print("Too high. Guess again: ");
                guess = input.next();
                counter++;
                guessNum = Integer.parseInt(guess);
            }
            // if guess is too low
            else {

                // prompt for new input, scan input to guess, up counter, and convert to int
                System.out.print("Too low. Guess again: ");
                guess = input.next();
                counter++;
                guessNum = Integer.parseInt(guess);
            }
        }

        // print output for how many guesses
        System.out.println("You got it in " + counter + " guesses!");

        // pass to play again
        playAgain();

    }

    // determines if guess is valid
    public static boolean checkIfValidGuess(String guess) {

        // check if empty
        if (guess.equals(""))
            return true; // return true if not valid

        // enter for loop
        for (int i = 0; i < guess.length(); i++) {

            // check if character at is not a digit
            if (!Character.isDigit(guess.charAt(i)))
                return true; // return true if not valid
        }

        return false; // return false if valid
    }

    // checks if want to play again
    public static void playAgain() {

        // prompt for input, scan input to answer
        System.out.print("\nDo you wish to play again (Y/N)? ");
        Scanner input = new Scanner(System.in);
        String answer = input.next().toUpperCase();

        System.out.println(""); // add new line

        // enter while if answer not valid
        while (!(answer.equals("Y") || answer.equals("N"))) {

            // print not valid and prompt for new input, scan input
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("Do you wish to play again (Y/N)? ");
            answer = input.next().toUpperCase();
        }

        // enter if else
        if (answer.equals("Y"))
            difficultySelect(); // pass to difficulty select if y
        else
            System.exit(0); // exit if n

    }

}
