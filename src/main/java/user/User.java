package user;

import category.BaseCategory;
import item.Comment;
import item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String nationalCode;
    private Gender gender;
    private List<Item> purchasedItems;
    private List<Comment> comments;
    private List<Item> likedItems;
    private Double credit;

    public User(String firstName, String lastName, String email, String mobileNumber, String nationalCode, Gender gender, Double credit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.nationalCode = nationalCode;
        this.gender = gender;
        this.purchasedItems = new ArrayList<Item>();
        this.comments = new ArrayList<Comment>();
        this.likedItems = new ArrayList<Item>();
        this.credit = credit;
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

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void like(Item item) {
        item.addLike(this);
        this.likedItems.add(item);
    }

    public void unlike(Item item) {
        item.removeLike(this);
        this.likedItems.remove(item);
    }


    public List<Item> getLikedItems() {
        return likedItems;
    }
}
