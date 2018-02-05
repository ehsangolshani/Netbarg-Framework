package payment;

import item.Item;
import user.User;

import java.util.List;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public class Transaction {
    private User user;
    private List<Item> items;
    private double amount;

    public Transaction(User user, List<Item> items, double amount) {
        this.user = user;
        this.items = items;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Double.toString(this.amount);
    }
}
