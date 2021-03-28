import java.util.Scanner;

public class Main {

    public static int convert(Long val) {

        int output = 0;
        try {

            if (val > Integer.MAX_VALUE) {
                output = Integer.MAX_VALUE;
            } else if (val < Integer.MIN_VALUE) {
                output = Integer.MIN_VALUE;
            } else {
                output = Integer.parseInt(String.valueOf(val));
            }

        } catch (Exception e) {
            return 0;
        }
        return output;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
