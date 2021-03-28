import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate initial = LocalDate.of(year, month, 1);
        for (int i = initial.withDayOfMonth(1).getDayOfMonth(); i <= initial.lengthOfMonth(); i++) {
            if (initial.withDayOfMonth(i).getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(initial.withDayOfMonth(i));
            }
        }
    }
}
