package Part9.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> items;
    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if( this.maximumCapacity >= weight() + packable.weight()) {
            this.items.add(packable);
        }
    }


    @Override
    public double weight() {
        double currentWeight = 0.0;

        for(Packable item : items) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {

        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }



}
