import java.util.Scanner;

class SimpleCalculator {
    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
            return;
        }
        System.out.println(a / b);
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        String operator = input.next();
        long b = input.nextLong();

        switch (operator) {
            case "/":
                divideTwoNumbers(a, b);
                break;
            case "*":
                multiplyTwoNumbers(a, b);
                break;
            case "-":
                subtractTwoNumbers(a, b);
                break;
            default:
                sumTwoNumbers(a, b);
                break;
        }
    }
}
