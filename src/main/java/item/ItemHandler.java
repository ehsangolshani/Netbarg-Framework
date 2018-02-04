package item;

import category.BaseCategory;
import category.Category;
import search.ItemSearchByName;
import search.ItemSearchStrategy;

import java.util.*;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemHandler {
    private static ItemHandler instance = new ItemHandler();
    private Map<Item, BaseCategory> items;
    private List<Tag> tags = new ArrayList<Tag>();
    private ItemSearchStrategy itemSearchStrategy;
    private Category itemsCategory;

    public static ItemHandler getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new ItemHandler();
            return instance;
        }
    }

    private ItemHandler() {
        items = new HashMap<Item, BaseCategory>();
        itemSearchStrategy = new ItemSearchByName();
    }


    public void addItem(Item item) {
        this.items.put(item, item.getCategory());
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public Map<Item, BaseCategory> getItems() {
        return items;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Item searchItem(String data, Map<Item, BaseCategory> items) {
        Iterator<Map.Entry<Item, BaseCategory>> itemsIterator = this.items.entrySet().iterator();
        return this.itemSearchStrategy.searchItem(data, itemsIterator);
    }

    public Category getItemsCategory() {
        return itemsCategory;
    }

    public void setItemsCategory(Category itemsCategory) {
        this.itemsCategory = itemsCategory;
    }

}

