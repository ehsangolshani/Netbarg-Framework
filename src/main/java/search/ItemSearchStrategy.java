package search;

import category.BaseCategory;
import item.Item;

import java.util.*;


/**
 * Created by ehsangolshani on 1/1/18.
 */
public interface ItemSearchStrategy {
    Item searchItem(String data, Iterator<Map.Entry<Item, BaseCategory>> itemsIterator);
}

