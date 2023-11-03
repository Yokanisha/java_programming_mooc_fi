package Part10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("C:/Users/Armut/Desktop/Java-IntelliJ/Java_programm_KIT/Java-KIT/src/Part10/literacy.csv"))
                    .map(x -> x.split(","))
                    .sorted((x1, x2) -> { return x1[5].compareTo(x2[5]);})
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

    }


}
