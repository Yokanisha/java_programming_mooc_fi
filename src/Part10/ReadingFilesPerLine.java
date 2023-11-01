package Part10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    List<String> reads = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name: ");
        String filename = scanner.nextLine();

    }

    public static List<String> read(String file) {
        List<String> reading = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(s -> reading.add(s));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return reading;
    }

}

