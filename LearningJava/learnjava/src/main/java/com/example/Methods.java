package com.example;

/**
 * Created by user on 8/15/16.
 */
public class Methods {
    public static void main(String[] args) {
        printName();
        printArea(20, 30);
        int area = getArea(5, 6);
        System.out.println("getArea = " + area);
    }

    public static void printName() {
        System.out.println("Hi. My name is Red, but my friends call me Red.");
    }

    public static void printArea(int length, int width) {
        System.out.println("Area: " + (length * width));
    }

    public static int getArea(int length, int width) {  // int rather than void because we're returning something
        return length * width;
    }
}
