package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        Double radius = 0d;

        while (!validInput) {
            System.out.print("Enter a radius: ");
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("Error: The radius must be non-negative!");
                } else {
                    validInput = true;
                }
            } else {
                System.out.println("Error: You must enter a number!");
                input.next();
            }
        }
        input.close();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
