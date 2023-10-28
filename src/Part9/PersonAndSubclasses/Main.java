package Part9.PersonAndSubclasses;

import java.util.ArrayList;

public class Main {

    public static void printPersons(ArrayList<Person> persons) {
        for(Person person : persons) {
            System.out.println(person.toString());
        }
    }


    public static void main(String[] args) {

        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        //ollie.credits();       // DOESN'T WORK!
        //ollie.study();              // DOESN'T WORK!
        System.out.println(ollie);


    }
}




