package item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Tag {
    private List<Item> items;
    private String text;

    public Tag(List<Item> items, String text) {

        if (items != null) {
            this.items = items;
        } else {
            this.items = new ArrayList<Item>();
        }

        this.text = text;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void addItems(List<Item> items) {
        this.items.addAll(items);
    }

    public List<Item> getItems() {
        return this.items;
    }
}


