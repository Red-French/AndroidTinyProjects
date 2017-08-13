package com.example;

/**
 * Created by user on 8/15/16.
 */
public class Conditionals {
    public static void main(String[] args) {
        if (1 == 1) {
            System.out.println("Success");
        }

        int accountBalance = 100;
        int itemCost = 250;

        if (accountBalance > itemCost) {
            System.out.println("You bought it!");
        } else {
            System.out.println("Not enough money, Jack.");
        }

        int degrees = 60;

        if (degrees >= 70) {
            System.out.println("It's warm/hot out.");
        } else if (degrees < 70 && degrees >= 59) {
            System.out.println("You might need a sweater.");
        } else {
            System.out.println("Put on a coat, dude.");
        }

        boolean firstTimeCustomer = false;
        boolean isExecutiveMember = true;

        if (firstTimeCustomer || isExecutiveMember) {
            System.out.println("You receive 10% off!");
        }
    }
}
