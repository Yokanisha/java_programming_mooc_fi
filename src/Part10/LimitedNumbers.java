package Part10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int number = scanner.nextInt();
            if(number < 0) {
                break;
            }
            numbers.add(number);
        }

        ArrayList<Integer> prints = numbers.stream()
                .filter(i -> i >= 1 && i <= 5)
                .collect(Collectors.toCollection(ArrayList::new));

        prints.stream()
                .forEach(p -> System.out.println(p));
    }
}

