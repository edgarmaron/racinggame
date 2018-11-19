package org.fasttrackkit;

public class Vehicle {

    String name;
    String color;
    Driver driver;

//Method signature: return type (void or something else) +name + list of params (0 or more)
    double accelerate(double speed, double durationinhours) {
//        method body
        System.out.println("acceleration speed:" + speed);
        return speed * durationinhours;

    }

}
