public class methods {
    static void myMethod() {
        System.out.println("Hello world!");
    }

    static void myMethod2(String fname) {
        System.out.println("I love " + fname);
    }

    static void myMethod3(String fname, int age) {
        System.out.println(" My name is " + fname + " and i am " + age + " years old");
    }

    static int myMethod4(int x) {
        return 10 + x;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted -You are old enough!");
        }
    }

    // method overloading
    static int methodOverload(int x, int y) {
        return x + y;
    }

    static double methodOverload(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        myMethod2("Fufu");
        System.out.println(myMethod4(9));
        checkAge(20);
        myMethod3("Samuel Freeman", 34);
        System.out.println(methodOverload(2, 4));
        System.out.println(methodOverload(3.1, 4.0));
        int result = sum(10);

        System.out.println(result);
    }

    // recursion
    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
      }
}

