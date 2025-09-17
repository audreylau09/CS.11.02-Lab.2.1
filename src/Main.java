import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Audrey Lau
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(3, 8));
        System.out.println(add(3, 8, 4, 9));
        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));
        System.out.println(triple("oohbaby"));
        System.out.println(half(17));
        System.out.println(roundPositiveValueToNearestInteger(8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.49));
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        int x = add(a, b);
        int y = add(c, d);
        return add(x, y);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String name) {
            return name + name + name;
        }
    // 6. half
    public static double half(int a) {
        return (double) a / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        if (a > 0) {
            return (int) Math.round(a);
        }
        return 0;
     }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        if (a < 0) {
            return (int) Math.round(a);
        }
        return 0;
    }
}
