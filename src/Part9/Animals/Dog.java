package Part9.Animals;

public class Dog extends Animal implements NoiseCapable{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this("Dog");
    }

    public void bark() {
        String message = String.format("%s barks", this.getName());
        System.out.println(message);
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
