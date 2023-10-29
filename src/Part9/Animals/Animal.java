package Part9.Animals;

public abstract class  Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        String message = String.format("%s eats", this.name);
        System.out.println(message);
    }
    public void sleep() {
        String message = String.format("%s sleeps", this.name);
        System.out.println(message);
    }
    public String getName() {
        return this.name;
    }
}
