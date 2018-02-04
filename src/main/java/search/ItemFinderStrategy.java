package search;

import item.Item;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public interface ItemFinderStrategy {
    List<Item> findItems(Iterator<Item> items);

}
