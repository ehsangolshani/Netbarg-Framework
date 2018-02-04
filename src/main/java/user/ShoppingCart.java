package user;

import item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(List<Item> items) {
        if (items == null) {
            this.items = new ArrayList<Item>();
        }
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void clear() {
        this.items.clear();
    }

}
