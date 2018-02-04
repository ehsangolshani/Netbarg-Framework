package payment;

import item.Item;
import user.User;

import java.util.Iterator;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class DefaultPurchase implements PurchaseStrategy {

    public double purchase(Iterator<Item> items, User user, String discountCode) {
        return 0;
    }
}
