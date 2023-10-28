package Part9.Test2;

public class Main {

    public static void main(String[] args) {
        B a = new B();
        a.methodeA("aaaa");
        a.methodeB();

        A b = new B();
        b.methodeA(); // methodeA aus Klasse A - Er kann keine Mthoden nehmen die in Klasse B sind aber nicht in Klasse A
    }
}
