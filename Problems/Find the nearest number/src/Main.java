import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readArrayList(scanner);

        int myNumber = scanner.nextInt();

        int distance = Math.abs(list1.get(0) - myNumber);

        for (int c = 1; c < list1.size(); c++) {
            int cDistance = Math.abs(list1.get(c) - myNumber);
            if (cDistance < distance) {

                distance = cDistance;
            }
        }
        for (Integer integer : list1) {

            if (Math.abs(integer - myNumber) <= distance) {

                list2.add(integer);
            }
        }
        Collections.sort(list2);
        list2.forEach(n -> System.out.print(n + " "));
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
