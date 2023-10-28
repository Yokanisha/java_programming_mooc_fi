package Part9.PersonAndSubclasses;

public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }


}
