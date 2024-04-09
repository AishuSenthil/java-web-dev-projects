package org.launchcode;

import java.util.Scanner;

import static java.lang.Math.round;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
//        double area =Math.PI *radius*radius;
//        area = Math.round(area * 1000.0) / 1000.0;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        input.close();
    }
}
