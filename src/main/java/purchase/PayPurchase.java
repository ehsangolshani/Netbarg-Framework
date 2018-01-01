package purchase;

import item.Item;
import user.User;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class PayPurchase implements PurchaseStrategy {
    public boolean purchase(Item item, User user) {
        return false;
    }
}
