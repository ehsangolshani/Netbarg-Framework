package user;

import item.Comment;
import item.Item;
import item.Point;
import payment.PaymentHandler;
import payment.PurchaseStrategy;
import payment.Transaction;

import java.util.ArrayList;
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

    public void addToShoppingCart(Item item) {
        this.shoppingCart.addItem(item);
    }

    public void removeFromShoppingCart(Item item) {
        this.shoppingCart.removeItem(item);
    }

    public void like(Item item) {
        item.addLike(this);
        this.wishList.add(item);
    }

    public void unlike(Item item) {
        item.removeLike(this);
        this.wishList.remove(item);
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

    public boolean purchase(List<Item> items, String discountCode, PaymentHandler paymentHandler) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.calculateCost();
        }
        if (this.getCredit() >= totalPrice) {
            double shoppingPrice = this.purchaseStrategy.purchase(items.iterator(), this, discountCode);
            Transaction userTransaction = new Transaction(this, items, shoppingPrice);
            paymentHandler.addTransaction(userTransaction);
            this.purchasedItems.addAll(items);
            for (Item item : items) {
                item.getSales().addBuyer(this);
            }
            return true;
        } else {
            return false;
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public void setPurchasedItems(List<Item> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public List<Item> getWishList() {
        return wishList;
    }

    public void setWishList(List<Item> wishList) {
        this.wishList = wishList;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
