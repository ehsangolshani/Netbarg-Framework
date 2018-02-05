package search;

import item.Item;
import item.Tag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemSearchByTag implements ItemSearchStrategy {

    public List<Item> searchItems(String data, Iterator<Item> items) {

        List<Item> resultItems = new ArrayList<Item>();

        while (items.hasNext()) {
            Item tmpItem = items.next();
            for (Tag tag : tmpItem.getTags()) {
                if (tag.getText().equals(data)) {
                    resultItems.add(tmpItem);
                    break;
                }
            }
        }
        return resultItems;
    }
}
