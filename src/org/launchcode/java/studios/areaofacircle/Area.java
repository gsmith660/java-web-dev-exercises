package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;

        do {
            System.out.print("Enter a radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Error: You must enter a number!");
                input.next();
                System.out.print("Enter a radius: ");
            }
            radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Error: The radius must be non-negative!");
            }
        } while (radius < 0);

//        boolean validInput = false;
//        while (!validInput) {
//            System.out.print("Enter a radius: ");
//            if (input.hasNextDouble()) {
//                radius = input.nextDouble();
//                if (radius < 0) {
//                    System.out.println("Error: The radius must be non-negative!");
//                } else {
//                    validInput = true;
//                }
//            } else {
//                System.out.println("Error: You must enter a number!");
//                input.next();
//            }
//        }

        input.close();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
