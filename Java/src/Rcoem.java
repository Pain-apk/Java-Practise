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