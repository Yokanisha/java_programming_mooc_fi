package Part9.PersonAndSubclasses;

public class Student extends Person{

     int credits;
     public Student(String name, String address) {
         super(name, address);
         this.credits = 0;
     }

     public void study() {
         this.credits += 1;
     }

     public int credits() {
         return this.credits;
     }

     public String toString() {
         return super.toString() + "\n  Study credits " + this.credits;
     }


}
