import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        long hours =
                Math.abs(
                        ChronoUnit.HOURS.between(firstDateTime,
                                firstDateTime.withDayOfYear(1).withHour(0))
                );
        System.out.println(hours);
    }
}
