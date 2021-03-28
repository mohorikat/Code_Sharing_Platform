import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final int minutes = scanner.nextInt();
        LocalDateTime secondDateTime = firstDateTime.plusMinutes(minutes);
        System.out.println(
                secondDateTime.getYear()
                        + " "
                        + secondDateTime.getDayOfYear()
                        + " "
                        + secondDateTime.toLocalTime());
    }
}
