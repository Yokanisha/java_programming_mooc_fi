package Part10.EnumAndIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {

    private List<Person> person;

    public Employees() {
        this.person = new ArrayList<>();
    }


    public void add(Person personToAdd) {
        this.person.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(s -> this.person.add(s));
    }

    public void print() {
        Iterator<Person> iterator = this.person.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.person.iterator();

        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = person.iterator();

        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education) {
                iterator.remove();
            }
        }

    }

}