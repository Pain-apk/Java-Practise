public class Variables {
//In this file we are going to see how variables work, their scopes and their initiliazation
public static void main(String args[]) {
    int x; // known to all code within main
    x = 10;
    if(x == 10) { // start new scope
    int y = 20; // known only to this block
    // x and y both known here.
    System.out.println("x and y: " + x + " " + y);
    x = y * 2;
    }
    // y = 100; // Error! y not known here
    // x is still known here.
    System.out.println("x is " + x);
// Demonstrate dynamic initialization
    double a = 3.0, b = 4.0;
 // c is dynamically initialized
 double c = Math.sqrt(a * a + b * b);
 System.out.println("Hypotenuse is " + c);

    }
   }
}
