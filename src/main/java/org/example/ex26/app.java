package org.example.ex26;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

// app
public class app {

    // main
    public static void main(String[] args) {

        // initialize calculate
        PaymentCalculator calculate = new PaymentCalculator();

        // initialize months with calculate.calculateMonthsUntilPaidOff filled with values from get functions
        String months = calculate.calculateMonthsUntilPaidOff(getBalance(), getAPR(), getPayment());

        // print output
        System.out.println("It will take you " + months + " months to pay off this card.");
    }

    // returns balance
    public static double getBalance() {

        // initialize df and set rounding mode
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // prompt for input, scan input, and return formatted double
        System.out.print("What is your balance? ");
        Scanner input = new Scanner(System.in);
        return Double.parseDouble(df.format(input.nextDouble()));
    }

    // returns APR
    public static double getAPR() {

        // prompt for input, scan input, return input
        System.out.print("What is the APR on the card (as a percent)? ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // returns monthly payment
    public static double getPayment() {

        // initialize df and set rounding mode
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // prompt for input, scan input, and return formatted double
        System.out.print("What is the monthly payment you can make? ");
        Scanner input = new Scanner(System.in);
        return Double.parseDouble(df.format(input.nextDouble()));
    }
}

// payment calculator
class PaymentCalculator {

    // returns string of months till paid off
    public static String calculateMonthsUntilPaidOff(double b, double i, double p) {

        // set i to decimal/daily rate
        i = i/100/365;

        // calculate months
        double n = (-(.03333333) * Math.log(1 + (b/p) * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i));

        // initialize df and set rounding mode
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.CEILING);

        // format double and return as string
        return df.format(n);
    }
}


