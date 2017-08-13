package com.example.vehicles;

/**
 * Created by user on 2/12/17.
 */

public class Vehicle {
    private String make;
    private String model;
    protected int horsepower;  // 'protected' means only files in this package(directory) can access this variable
    private int odometer = 0;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // ********** odometer getter and setter **********
    public int getOdometer() {
        return odometer;
    }

    public void addToOdometer(int milesToAdd) {
        if (milesToAdd > 0) {
            this.odometer += milesToAdd;
        }
    }
    // *********************************

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void accelerate() {
        System.out.println("Accelerating " + this.make);
    }

    public void printDetails() {
        System.out.println("Make: " + this.make + " Model: " + this.model);
    }
}
