import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int[] myNum = { 10, 20, 30, 40 };

        String[] vehicles = { "cars", "motors", "airplanes" };

        System.out.println(Arrays.toString(myNum));

        System.out.println(Arrays.toString(vehicles));

        System.out.print("length of the vehicles array is :");

        System.out.println(vehicles.length);

        for (int i : myNum) {
            System.out.println(i);
        }

        for (String i : vehicles) {
            System.out.println(i);
        }
    }
}
