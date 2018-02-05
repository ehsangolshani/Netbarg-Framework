package management;

import item.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ehsangolshani on 2/5/18.
 */
public class CreateBestSellerRow implements CreateRowStrategy {
    public List<Item> createRow(Iterator<Item> items) {
        List<Item> resultRow = new ArrayList<Item>();

        while (items.hasNext()) {
            Item tmpItem = items.next();
            if (tmpItem.getSales().getSalesCount() > 1) {
                resultRow.add(tmpItem);
            }
        }

        return resultRow;

    }
}
