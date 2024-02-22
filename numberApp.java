
// import scanner
import java.util.Scanner;

// create main class
public class numberApp {
    // create object
    public static void main(String[] args) {
        // declare variable
        int num ;
        // instantiate scanner
        Scanner myScanner = new Scanner(System.in);
        // display "enter a number"
        System.out.println("Enter a number!");
        // input num
        num = myScanner.nextInt();
        // check num for positive and negative numbers
        if (num > 0) {
            // display "the number is positive"
            System.out.println("The number is a positive number!");

        } else {
            // display "the number is negative"
            System.out.println("The number is a negative number!");
        }

    }
}
