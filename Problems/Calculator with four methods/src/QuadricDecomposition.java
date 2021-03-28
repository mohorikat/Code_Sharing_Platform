import java.util.Scanner;

public class QuadricDecomposition {
    public static void findRoots(double a, double b, double c) {
        // the equation is ax^2 + bx + c = 0
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void calculateRoots(double a, double b, double c, double discriminant) {
        double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (x1 == x2) {
            System.out.println("x = " + x1);
        } else {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
    System.out.println("solution a is: ");
        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else if (discriminant == 0) {
            calculateRoots(a, b, c, discriminant);
        } else {
            calculateRoots(a, b, c, discriminant);
        }

    System.out.println("solution b is: ");
         discriminant = calculateDiscriminant(a, b, c);

        calculateRoots(a, b, c, discriminant);
    System.out.println("solution c is: ");
        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else {
            calculateRoots(a, b, c, discriminant);
        }


    System.out.println("the original is: ");
    findRoots(a, b, c);
    }
}
