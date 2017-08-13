package com.example;

/**
 * Created by user on 2/11/17.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void speakName() {
        System.out.println("Hello.  My name is " + firstName + " " + lastName);
    }
}
