package payment;

import item.Item;
import user.User;

import javax.jws.soap.SOAPBinding;
import java.util.Iterator;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public interface PurchaseStrategy {
    double purchase(Iterator<Item> items, User user, String discountCode);
}
