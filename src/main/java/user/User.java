package user;

import category.BaseCategory;
import item.Comment;
import item.Item;
import item.Point;
import purchase.PurchaseStrategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class User {
    private Account account;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String nationalCode;
    private Gender gender;
    private List<Item> purchasedItems;
    private List<Item> wishList;
    private Double credit;
    private boolean loginStatus;
    private ShoppingCart shoppingCart;
    private PurchaseStrategy purchaseStrategy;


    public User(Account account, String firstName, String lastName, String email, String mobileNumber,
                String nationalCode, Gender gender, Double credit, PurchaseStrategy purchaseStrategy) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.nationalCode = nationalCode;
        this.gender = gender;
        this.purchasedItems = new ArrayList<Item>();
        this.wishList = new ArrayList<Item>();
        this.credit = credit;
        this.loginStatus = false;
        this.shoppingCart = new ShoppingCart(new ArrayList<Item>());
        this.purchaseStrategy = purchaseStrategy;
    }

    public void addPurchasedItem(Item item) {
        this.purchasedItems.add(item);
    }

    public void removePurchasedItem(Item item) {
        this.purchasedItems.remove(item);
    }

    public List<Item> getPurchasedItems() {
        return this.purchasedItems;
    }

    public void addComment(Comment comment, Item item) {
        item.getComments().addComment(comment);
    }

    public void removeComment(Comment comment, Item item) {
        item.getComments().removeComment(comment);
    }

    public void addPoint(Point point, Item item) {
        item.getPoints().addPoint(point);
    }

    public void removePoint(Point point, Item item) {
        item.getPoints().removePoint(point);
    }

    public void addToWishList(Item item) {
        this.wishList.add(item);
    }

    public void removeFromWishList(Item item) {
        this.wishList.remove(item);
    }

    public void like(Item item) {
        item.addLike(this);
    }

    public void unlike(Item item) {
        item.removeLike(this);
    }

    public boolean login(String username, String password) {
        if (this.account.accountMatch(username, password)) {
            this.loginStatus = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean logout() {
        if (this.loginStatus == true) {
            this.loginStatus = false;
        }
        return true;
    }

    public boolean purchase(List<Item> items, String discountCode) {
        boolean shoppingResult = this.purchaseStrategy.purchase(items.iterator(), this, discountCode);
        return shoppingResult;
    }
}
