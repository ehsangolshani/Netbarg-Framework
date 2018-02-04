package item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Tag {

    private String text;
    private List<Item> items;

    public Tag(String text, List<Item> items) {

        this.text = text;

        if (items == null) {
            this.items = new ArrayList<Item>();
        } else {
            this.items = items;
        }
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


