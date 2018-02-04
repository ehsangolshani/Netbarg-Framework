package search;

import category.BaseCategory;
import item.Item;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public interface ItemFinderStrategy {
    Item findItem(Iterator<Map.Entry<Item, BaseCategory>> itemsIterator);

}