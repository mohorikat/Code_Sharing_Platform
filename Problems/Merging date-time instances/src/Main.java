import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        int hour;
        int min;
        int sec;
        int day;
        Month month;

        int year = Math.max(dateTime1.getYear(), dateTime2.getYear());

        if (dateTime1.getMonthValue() >= dateTime2.getMonthValue()) {
            month = dateTime1.getMonth();
        } else {
            month = dateTime2.getMonth();
        }
        day = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        hour = Math.max(dateTime1.toLocalTime().getHour(), dateTime2.toLocalTime().getHour());
        min = Math.max(dateTime1.toLocalTime().getMinute(), dateTime2.toLocalTime().getMinute());
        sec = Math.max(dateTime1.toLocalTime().getSecond(), dateTime2.toLocalTime().getSecond());

        return LocalDateTime.of(year, month, day, hour, min, sec);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));

//    System.out.println(LocalDateTime.parse("2019-12-31T23:59").withSecond(59));
//
//    System.out.println(LocalDateTime.of(2020, 12, 31, 23, 59, 59).minusYears(1));
//
//        System.out.println( LocalDateTime.of(LocalDate.of(2019, 12, 31), LocalTime.MAX));
//
//       System.out.println( LocalDateTime.parse("2017-12-31T23:59").withYear(2019));
//       System.out.println( LocalDateTime.of(
//               2020, 1, 1, 0, 1, 1)
//               .minusSeconds(61));
//
//       System.out.println( LocalDateTime.of(LocalDate.of(2020, 1, 1), LocalTime.MIDNIGHT).minusSeconds(1));
    }
}
