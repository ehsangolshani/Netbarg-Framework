package item;

import category.BaseCategory;
import category.Category;
import category.CompositeCategory;
import search.ItemFinderStrategy;
import search.ItemSearchByName;
import search.ItemSearchStrategy;

import java.util.*;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemHandler {
    private List<Item> items;
    private List<Tag> tags = new ArrayList<Tag>();
    private ItemSearchStrategy itemSearchStrategy;
    private ItemFinderStrategy itemFinderStrategy;
    private CompositeCategory itemCategories;

    private ItemHandler(ItemSearchStrategy itemSearchStrategy, ItemFinderStrategy itemFinderStrategy
            , CompositeCategory itemCategories) {
        this.items = new ArrayList<Item>();
        this.tags = new ArrayList<Tag>();
        this.itemSearchStrategy = itemSearchStrategy;
        this.itemFinderStrategy = itemFinderStrategy;
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

    public List<Item> searchItems(String data, List<Item> items) {
        return this.itemSearchStrategy.searchItems(data, this.items.iterator());
    }

    public List<Item> findItems(String data, List<Item> items) {
        return this.itemSearchStrategy.searchItems(data, this.items.iterator());
    }

    public void setitemCategories(CompositeCategory itemCategories) {
        this.itemCategories = itemCategories;
    }

    public Category getitemCategories() {
        return itemCategories;
    }

}

