package Part9.Herds;

import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable moveOne : herd) {
            moveOne.move(dx, dy);
        }

    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public String toString() {
        String string = "";
        for(Movable moveOne : herd) {
            string += moveOne.toString() + "\n";
        }
        return string;
    }
}
