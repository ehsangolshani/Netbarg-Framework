package purchase;

import item.Item;
import user.User;

import java.util.Iterator;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class PayPurchase implements PurchaseStrategy {

    public boolean purchase(Iterator<Item> items, User user, String discountCode) {
        return false;
    }
}
