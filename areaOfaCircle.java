import java.util.Scanner;

public class areaOfaCircle {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the Radius of the circle");

        double Radius, PI, Area;

        PI = 3.147;

        Radius = myScanner.nextDouble();

        Area = (Radius * Radius) * PI;

        System.out.print("The area of the circle is : ");

        System.out.println(Area);
    }
}
