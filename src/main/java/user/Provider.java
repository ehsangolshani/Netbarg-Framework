package user;


import item.Comment;
import item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Provider {
    private User user;
    private String providerName;
    private String address;
    private String city;
    private String longitude;
    private String latitude;
    private List<User> likedUsers;
    private List<Item> publishItems;

    public Provider(User user, String providerName, String address, String city, String longitude, String latitude, List<User> likedUsers, List<Item> publishItems) {
        this.user = user;
        this.providerName = providerName;
        this.address = address;
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.likedUsers = new ArrayList<User>();
        this.publishItems = new ArrayList<Item>();
    }

    public void addpublishedItem(Item item) {
        this.publishItems.add(item);
    }

    public void removePublishedItem(Item item) {
        this.publishItems.remove(item);
    }

    public List<Item> getPublishedItems() {
        return this.publishItems;
    }

    public void addLike(User user) {
        this.likedUsers.add(user);
    }

    public void removeLike(User user) {
        this.likedUsers.remove(user);
    }


}

