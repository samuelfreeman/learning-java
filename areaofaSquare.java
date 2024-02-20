import java.util.Scanner;

public class areaofaSquare {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double length, Area;
        System.out.println("Please enter your length");
        length = myScanner.nextDouble();
        Area = length * length;
        System.out.print("The area of the square is :");
        System.out.println(Area);
    }
}
