package search;

import item.Item;
import item.Tag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public class PopularItemFinder implements ItemFinderStrategy {

    public List<Item> findItems(Iterator<Item> items) {

        List<Item> resultItems = new ArrayList<Item>();

        while (items.hasNext()) {
            Item tmpItem = items.next();
            if (tmpItem.getPoints().getAveragePoint() > 17.0) {
                resultItems.add(tmpItem);
            }

        }
        return resultItems;
    }
}
