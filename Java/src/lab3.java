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
