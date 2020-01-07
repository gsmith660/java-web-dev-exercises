package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Error: The radius must be non-negative!");
            } else {
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
        } else {
            System.out.println("Error: You must enter a number!");
        }
        
    }
}
