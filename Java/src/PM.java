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