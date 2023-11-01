package Part10;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {

            String input = scanner.nextLine();
            if(input.equals(""))  {
                break;
            }

            list.add(input);
        }

        String prints = list.stream()
                .reduce("", (previousString, words) -> previousString + words + "\n");
        System.out.println(prints);





    }
}

