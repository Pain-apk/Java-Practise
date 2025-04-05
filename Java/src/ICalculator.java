// Interface defining the structure of a calculator
interface IICalculator {

    // Method to find the largest of two numbers
    public int Largest(int a, int b);

    // Method to add two numbers
    public int add(int a, int b);

    // Method to subtract two numbers
    public int sub(int a, int b);

    // Method to multiply two numbers
    public int mul(int a, int b);

    // Method to divide two numbers
    public int div(int a, int b);
}

// Class implementing the IICalculator interface
class calculator implements IICalculator {

    // Implementation of the add method
    public int add(int a, int b) {
        // Return the sum of two numbers
        return a + b;
    }

    // Implementation of the Largest method
    public int Largest(int a, int b) {
        // Return the larger of two numbers
        return Math.max(a, b);
    }

    // Implementation of the sub method
    public int sub(int a, int b) {
        // Return the difference of two numbers
        return a - b;
    }

    // Implementation of the mul method
    public int mul(int a, int b) {
        // Return the product of two numbers
        return a * b;
    }

    // Implementation of the div method
    public int div(int a, int b) {
        // Return the quotient of two numbers
        return a / b;
    }
}

// Main class to test the calculator functionality
public class ICalculator {

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