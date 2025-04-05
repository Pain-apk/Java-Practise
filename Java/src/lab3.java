import java.util.Scanner;

// Code 1: Multiplication of two numbers
package test;

public class lab3 {

    // Method to multiply two numbers
    public static int multiply_numbers(int a, int b) {
        int product = a * b; // Calculate the product of a and b
        return product; // Return the product
    }

    public static void main(String[] args) {
        lab3 s = new lab3(); // Create an object of the lab3 class
        int result = s.multiply_numbers(10, 20); // Call the multiply_numbers method
        System.out.println("Result=" + result); // Print the result
    }
}

// Code 2: Constructor demonstration
package test;

public class Rcoem {

    String name; // Instance variable to store the name

    // Constructor to initialize the name
    Rcoem(String n) {
        name = n; // Assign the parameter value to the instance variable
        System.out.println("Constructor is called"); // Print a message
    }

    public static void main(String[] args) {
        // Creating an object in the main class
        Rcoem obj1 = new Rcoem("ECS"); // Call the constructor with "ECS"
        System.out.println("The name is " + obj1.name); // Print the name
    }
}

// Code 3: Finding the perimeter of a circle
package test;


class PM {
    double perimeter; // Instance variable to store the perimeter

    // Constructor to calculate the perimeter of a circle
    PM(double r) {
        perimeter = (22 * 2 * r) / 7; // Calculate the perimeter using the formula
    }
}

public class Perimeter {

    public static void main(String[] args) {
        // Finding the perimeter of a circle
        Scanner s = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter radius:"); // Prompt the user to enter the radius
        double rad = s.nextDouble(); // Read the radius from the user
        PM p = new PM(rad); // Create an object of the PM class
        System.out.println("The perimeter is =" + p.perimeter); // Print the perimeter
    }
}