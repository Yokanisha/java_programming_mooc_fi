package Part9.Animals;

public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Cat");
    }

    public void purr() {
        System.out.println("%s purrs".formatted(this.getName()));
    }


    @Override
    public void makeNoise() {
        purr();
    }
}
