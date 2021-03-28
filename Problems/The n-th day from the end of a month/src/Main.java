import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int offSet = scanner.nextInt();

        LocalDate initial = LocalDate.of(year, month, 1);
        initial = initial.withDayOfMonth(initial.lengthOfMonth() - offSet + 1);

        System.out.println(initial);
    }
}
