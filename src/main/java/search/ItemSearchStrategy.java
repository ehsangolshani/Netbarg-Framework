package search;

import item.Item;

import java.util.*;


/**
 * Created by ehsangolshani on 1/1/18.
 */
public interface ItemSearchStrategy {
    List<Item> searchItems(String data, Iterator<Item> items);
}

