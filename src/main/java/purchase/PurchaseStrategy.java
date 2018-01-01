package purchase;

import item.Item;
import user.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public interface PurchaseStrategy {
    boolean purchase(Item item, User user);
}
