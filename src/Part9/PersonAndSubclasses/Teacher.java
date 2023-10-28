package Part9.PersonAndSubclasses;

public class Teacher extends Person{
    int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;

    }

    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }


}
