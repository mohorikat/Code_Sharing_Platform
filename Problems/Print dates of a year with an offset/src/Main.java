import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LocalDate date = LocalDate.parse(scanner.next());
    int offSet = scanner.nextInt();
    LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfYear());
    for (LocalDate i = date; !i.isAfter(lastDay); i = date) {
      System.out.println(date);
      date = date.plusDays(offSet);
    }
  }
}
