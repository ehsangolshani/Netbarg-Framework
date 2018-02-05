package item;

import search.ItemFinderStrategy;
import search.ItemSearchStrategy;

import java.util.*;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemHandler {
    private List<Item> items;
    private List<Tag> tags = new ArrayList<Tag>();
    private CompositeCategory itemCategories;

    public ItemHandler(CompositeCategory itemCategories) {
        this.items = new ArrayList<Item>();
        this.tags = new ArrayList<Tag>();
        this.itemCategories = itemCategories;
    }


    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addItems(List<Item> items) {
        this.items.addAll(items);
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void addTags(List<Tag> tags) {
        this.tags.addAll(tags);
    }

    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setitemCategories(CompositeCategory itemCategories) {
        this.itemCategories = itemCategories;
    }

    public Category getitemCategories() {
        return itemCategories;
    }

}

