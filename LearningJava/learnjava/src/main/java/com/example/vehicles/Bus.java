package com.example.vehicles;

/**
 * Created by user on 2/12/17.
 */

public class Bus extends Vehicle {

    public Bus(String make, String model) {
        super(make, model);
    }

    @Override  // this function will run instead of accelerate() in the parent class
    public void accelerate() {
        System.out.println("varrrroooom!!");
        super.accelerate();  // optionally, you can still run the super class accelerate() method

        System.out.println("I think the bus is gonna do it!");
    }
}
