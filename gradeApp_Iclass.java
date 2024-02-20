import java.util.Scanner;

public class gradeApp_Iclass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int score;
        System.out.println("Enter a score from 0 to 100!");
        score = myScanner.nextInt();
        if (score >= 80 && score <= 100) {
            System.out.println("A");
        } else if (score >= 75 && score <= 79) {
            System.out.println("B+");
        } else if (score >= 70 && score <= 74) {
            System.out.println("B");
        } else if (score >= 65 && score <= 69) {
            System.out.println("C+");
        } else if (score >= 60 && score <= 64) {
            System.out.println("C");
        } else if (score >= 55 && score <= 59) {
            System.out.println("D+");
        } else if (score >= 50 && score <= 54) {
            System.out.println("D");
        } else if (score >= 0 && score <= 49) {
            System.out.println("E");
        } else {
            System.out.println("You have entered an incorrect number!");
        }
    }
}
