import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LocalTime time1 = LocalTime.parse(scanner.next());
//        LocalTime time2 = LocalTime.parse(scanner.next());
//        System.out.println(Math.abs(time1.until(time2, ChronoUnit.SECONDS)));

    System.out.println(LocalTime.of(22, 20).withSecond(15));
    }
}