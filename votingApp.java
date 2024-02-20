
//  import the scanner for taking input
import java.util.Scanner;

// create the main class
public class votingApp {
    // create an object
    public static void main(String[] args) {
        // declare vairable
        int age;
        // instantiate scanner
        Scanner myScanner = new Scanner(System.in);
        // ask user to enter a num
        System.out.println("Please enter your age?");
        age = myScanner.nextInt();
        if (age >= 18) {
            System.out.println("Qualified to vote!");
        } else {
            System.out.println("Not qualified to vote !");
        }
    }

}
