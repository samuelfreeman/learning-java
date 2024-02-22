import java.util.Scanner;

public class areaOfaRectangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double length, width, Area;
        System.out.println("Please enter your length");
        length = myScanner.nextDouble();
        System.out.println("Please enter your Width");
        width = myScanner.nextDouble();
        Area = length * width;
        System.out.print("The area of the rectangle  is :");
        System.out.println(Area);
    }
}
