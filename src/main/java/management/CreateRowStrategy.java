package management;

import item.Item;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ehsangolshani on 2/5/18.
 */
public interface CreateRowStrategy {
    public List<Item> createRow(Iterator<Item> items);
}
