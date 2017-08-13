package com.example;

/**
 * Created by user on 8/16/16.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] battingAvg = new int[3];  // define an array of type integer with 3 spots
        double[] dblArray;  // define an array of type double

        String[] players;  // define an array of type String
        players = new String[5]; // create an array with 5 empty spots
        players[0] = "Johnny";
        players[1] = "Dudley";
        players[2] = "Phillip";
        players[3] = "Pete";
        players[4] = "Wendell";

        battingAvg[0] = 250;
        battingAvg[1] = 400;
        battingAvg[2] = 600;

            String[] top5cars = {  // define an array with data
                    "GTO", "Camaro", "Challenger", "Charger", "Barracuda"
            };

        System.out.println("val 1: " + battingAvg[0]);
        System.out.println("val 2: " + battingAvg[1]);
        System.out.println("val 3: " + battingAvg[2]);

        System.out.println(top5cars[3]);

        System.out.println("Total number of top cars: " + top5cars.length);
        System.out.println("Last car: " + top5cars[(top5cars.length - 1)]);
    }
}
