import java.util.Scanner;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        try {
            System.out.println(string.toLowerCase()); // != null ? string.toLowerCase() : null);
        } catch (NullPointerException e) {
            System.out.println("NPE!");
        }
    }
}
