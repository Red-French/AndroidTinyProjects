package com.example;

/**
 * Created by user on 8/15/16.
 */
public class Numbers {
    public static void main(String[] args) {
        int age = 25;
        int myFavoriteSports = -50;

        int sum = 5 + 5;
        int num1 = 10;
        int num2 = 12;
        System.out.println(sum);
        System.out.println(num1 + num2);

        int difference = 20 - 18;
        int product = 4 * 12;
        int divide = 15 / 5;
        int modulo = 20 % 3;

        System.out.println(difference);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(modulo);

        float bankbalance = 432.23f;
        double bigBalance = 578398032.4823;
        long hugeBankBalance = 1274231397;  // long holds up to the number 2 billion

        Integer myInt; // 'int' is a value type; 'Integer' is a class to wrap around an integer to give it special methods
        myInt = 550;
        String intStr =  myInt.toString();
        System.out.println(intStr);
    }
}
