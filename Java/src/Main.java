// Abstract class defining the structure of a calculator
abstract class IICalculator {

    // Method to add two numbers
    int add(int a, int b) {
        // Return the sum of two numbers
        return a + b;
    }

    // Method to subtract two numbers
    int sub(int a, int b) {
        // Return the difference of two numbers
        return a - b;
    }

    // Abstract method to find the largest of two numbers
    abstract int Largest(int a, int b);

    // Abstract method to multiply two numbers
    abstract int mul(int a, int b);

    // Abstract method to divide two numbers
    abstract int div(int a, int b);
}

// Class implementing the abstract methods of IICalculator
class calculator extends IICalculator {

    // Implementation of the Largest method
    int Largest(int a, int b) {
        // Return the larger of two numbers
        return Math.max(a, b);
    }

    // Implementation of the mul method
    int mul(int a, int b) {
        // Return the product of two numbers
        return a * b;
    }

    // Implementation of the div method
    int div(int a, int b) {
        // Return the quotient of two numbers
        return a / b;
    }

    // Overridden sub method (not used in this implementation)
    int sub(int a, int b) {
        // Return 0 (placeholder implementation)
        return 0;
    }
}

// Main class to test the calculator functionality
public class Main {

    public static void main(String[] args) {
        // Create an instance of the calculator class
        calculator a = new calculator();

        // Test the add method and print the result
        System.out.println(a.add(5, 6));

        // Test the sub method and print the result
        System.out.println(a.sub(5, 6));

        // Test the mul method and print the result
        System.out.println(a.mul(5, 6));

        // Test the div method and print the result
        System.out.println(a.div(5, 6));

        // Test the Largest method and print the result
        System.out.println(a.Largest(5, 6));
    }
}