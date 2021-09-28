/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex33;

import java.util.Random;
import java.util.Scanner;

public class app {

    // main
    public static void main(String[] args) {

        // initialize and declare answers array
        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};

        // print input prompt and scan input
        System.out.print("What's your question?\n> ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

        // pass to eightBall
        eightBall(answers);
    }

    // produces answer
    public static void eightBall(String[] answers) {

        // initialize rand
        Random rand = new Random();

        // print randomized output
        System.out.println("\n" + answers[rand.nextInt(4)]);
    }
}
