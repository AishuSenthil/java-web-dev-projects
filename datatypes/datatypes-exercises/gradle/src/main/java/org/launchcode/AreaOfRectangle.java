package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide a number for length of rectangle:");
        Integer lengthRec = input.nextInt();

        System.out.println("Provide a number for width of rectangle:");
        Integer widthRec = input.nextInt();

        System.out.println("The area of your triangle is: " + lengthRec * widthRec);
    }
}
