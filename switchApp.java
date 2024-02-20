import java.util.Scanner;

public class switchApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 1: for English ");
        System.out.println("Please enter 2: for Hausah ");
        System.out.println("Please enter 3: for Twi ");
        int num;
        num = myScanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("English");

                break;
            case 2:
                System.out.println("Hausah");

                break;
            case 3:
                System.out.println("Twi");

                break;
            default:
                System.out.println("You have entered a wrong number");
                break;
        }
    }
}
