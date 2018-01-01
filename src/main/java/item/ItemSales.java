package item;

import user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemSales {
    private List<User> buyers;

    public ItemSales(List<User> buyers) {
        if (buyers != null) {
            this.buyers = buyers;
        } else {
            this.buyers = new ArrayList<User>();
        }
    }

    public int getSalesCount() {
        return this.buyers.size();
    }

    public boolean isBuyer(User user) {
        return this.buyers.contains(user);
    }

    public void addBuyer(User user) {
        this.buyers.add(user);
    }


    public List<User> getBuyers() {
        return this.buyers;
    }
}
