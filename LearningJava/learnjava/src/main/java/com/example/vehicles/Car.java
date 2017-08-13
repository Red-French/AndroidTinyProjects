package com.example.vehicles;

/**
 * Created by user on 2/12/17.
 */

public class Car extends Vehicle {  // 'extends' means inherit, so this is a child class of the parent, Vehicle class

    private String bigRacecar;

    public Car(String make, String model) {
        super(make, model);
    }

    public void accelerate(String raceCar) {
        this.bigRacecar = raceCar;
        System.out.println("Accelerating the " + raceCar);
    }

    public void turnOnNOS() {
        this.horsepower += 150;
        System.out.println(this.bigRacecar + " gets a " + this.horsepower + " horsepower boost!");
        System.out.println(this.bigRacecar + " wins!!");
    }
}
