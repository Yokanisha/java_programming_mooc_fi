package Part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        int sumWeight = 0;
        for(Item myitem : this.items) {
            sumWeight += myitem.getWeight();
        }

        if(sumWeight + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }

    }
    public boolean isInBox(Item item) {
        if(this.items.contains(item)) {
            return true;
        }
        return false;
    }


}
