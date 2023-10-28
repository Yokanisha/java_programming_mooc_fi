package Part9.OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;
    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if(shoppingCart.keySet().contains(product)) {
            shoppingCart.get(product).increaseQuantity();
        } else {
            shoppingCart.put(product, new Item(product, 1, price));
        }

    }
    public int price() {
        int sum = 0;
        for(Item items : shoppingCart.values()) {
            sum += items.price();
        }
        return sum;
    }

    public void print() {
        for(Item items : shoppingCart.values()) {
            System.out.println(items.toString());
        }
    }


}
