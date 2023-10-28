package Part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> oneItemList;
    public OneItemBox() {
        this.oneItemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(oneItemList.isEmpty() ) {
            oneItemList.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        if(oneItemList.contains(item)) {
            return true;
        }
        return false;
    }
}
