package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
