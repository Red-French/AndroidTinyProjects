package com.example;

public class Strings {
    public static void main(String[] args) {  // this is a very standard entry point for an app in Java
        String name = "Pete Rose";
        int homeruns  = 3256;
        float balance = 50.37f;
        System.out.println(name + " has " + homeruns + " homeruns" + " and $" + balance + " in the bank.");

        String vehicle = "Truck";
        String make = "Chevy";
        String model = "1500";
        String fullVehicleDetails = vehicle + " - " + make + " - " + model;
        System.out.println(fullVehicleDetails);

        String upper = "CRAZY HORSE";
        String lower = upper.toLowerCase();
        System.out.println(lower);

        int accountBalance = 500;
        String detail = "exactly";
        String printBalance = String.format("Your account balance is %s %d", detail, accountBalance);
        System.out.println(printBalance);
    }
}
