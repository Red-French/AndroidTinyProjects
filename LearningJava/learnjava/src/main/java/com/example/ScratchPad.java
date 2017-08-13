package com.example;

import com.example.vehicles.Bus;
import com.example.vehicles.Car;
import com.example.vehicles.Vehicle;

import polymorphism.Rectangle;
import polymorphism.Triangle;


/**
 * Created by user on 2/11/17.
 */

public class ScratchPad {

    public static void main(String[] args) {

        Person person = new Person("Fred", "Jorgenson", 45);
        person.speakName();

        Vehicle vehicle = new Vehicle("Honda", "Civic");
        vehicle.accelerate();

        Car car = new Car("Chevy", "Camaro");
        Bus bus = new Bus("Bluebird", "Bus");

        car.accelerate("Camaro");
        bus.accelerate();
        car.turnOnNOS();

        vehicle.printDetails();
        car.printDetails();  // car inherited vehicle's methods

        Rectangle rect = new Rectangle();
        rect.calculateArea(5, 6);

        Triangle tri = new Triangle();
        tri.calculateArea(5, 8);

        car.addToOdometer(-100);
        car.addToOdometer(500);
        System.out.println(car.getOdometer());
    }
}
