package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much gas was consumed (in gallons)?");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Miles-per-gallon for the trip was: " + mpg);
    }
}
