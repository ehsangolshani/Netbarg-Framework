package search;

import item.Item;
import item.ItemHandler;

import java.util.List;

/**
 * Created by ehsangolshani on 2/5/18.
 */
public class Search {

    private ItemHandler itemHandler;
    private ItemSearchStrategy itemSearchStrategy;
    private ItemFinderStrategy itemFinderStrategy;

    public Search(ItemHandler itemHandler, ItemSearchStrategy itemSearchStrategy, ItemFinderStrategy itemFinderStrategy) {
        this.itemHandler = itemHandler;
        this.itemSearchStrategy = itemSearchStrategy;
        this.itemFinderStrategy = itemFinderStrategy;
    }

    public List<Item> searchItems(String data, List<Item> items) {
        return this.itemSearchStrategy.searchItems(data, this.itemHandler.getItems().iterator());
    }

    public List<Item> findItems(String data, List<Item> items) {
        return this.itemSearchStrategy.searchItems(data, this.itemHandler.getItems().iterator());
    }
}
