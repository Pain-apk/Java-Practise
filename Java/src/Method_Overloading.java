package test;

import java.util.Scanner;

// Class demonstrating method overloading for calculating areas
public class Method_Overloading {

    // Method to calculate the area of a square
    static int area(int s) {
        // Area of square = side * side
        return s * s;
    }

    // Method to calculate the area of a circle
    static double area(double r) {
        // Area of circle = π * radius^2 (using 22/7 as an approximation for π)
        return (22 * r * r) / 7;
    }

    // Method to calculate the area of a triangle
    static double area(double h, double b) {
        // Area of triangle = (base * height) / 2
        return (b * h) / 2;
    }

    // Default constructor for the Method_Overloading class
    public Method_Overloading() {
        // No specific initialization required
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the side of the square
        System.out.println("Enter side");
        int s = sc.nextInt();

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter radius");
        double r = sc.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.println("Enter Height ");
        double h = sc.nextDouble();

        // Prompt the user to enter the base of the triangle
        System.out.println("Enter Breath");
        double b = sc.nextDouble();

        // Calculate and display the area of the square
        System.out.println("The Area of Square is " + area(s));

        // Calculate and display the area of the circle
        System.out.println("The Area of circle is " + area(r));

        // Calculate and display the area of the triangle
        System.out.println("The Area Triangle is " + area(h, b));

        // Close the Scanner object
        sc.close();
    }
}