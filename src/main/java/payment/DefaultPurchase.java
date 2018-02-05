package payment;

import item.Item;
import user.User;

import java.util.Iterator;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class DefaultPurchase implements PurchaseStrategy {

    public double purchase(Iterator<Item> items, User user, String discountCode) {
        double totalAmount = 0;

        while (items.hasNext()) {
            totalAmount += items.next().calculateCost();
        }
        if (discountCode.equals("golden code")) {
            totalAmount = totalAmount * (3.0 / 4.0);
        }
        return totalAmount;
    }
}
