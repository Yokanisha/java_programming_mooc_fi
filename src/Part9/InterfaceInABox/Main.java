package Part9.InterfaceInABox;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        Box boxes = new Box(20);
        boxes.add(box);
        boxes.add(box);
        boxes.add(new Book("B: Fyodor Dostoevsky", "B: Crime and Punishment", 2)) ;
        System.out.println(boxes);
    }
}
