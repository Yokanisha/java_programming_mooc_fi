package Part10.Literature;

import java.util.*;

public class MainProgram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();

            if(inputName.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());

            books.add(new Book(inputName, inputAge));

        }

        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");

/*

        books.stream()
                .sorted((x1, x2) -> x1.getAge() - x2.getAge())
                .forEach(s -> System.out.println(s));
*/

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                        .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for(Book book : books) {
            System.out.println(book);
        }
    }




}
