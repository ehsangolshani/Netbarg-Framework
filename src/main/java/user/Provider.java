package user;


import item.Comment;
import item.Item;
import item.ItemHandler;
import item.Tag;

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

    public Provider(User user, String providerName, String address, String city, String longitude,
                    String latitude, List<Item> publishItems) {
        this.user = user;
        this.providerName = providerName;
        this.address = address;
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.likedUsers = new ArrayList<User>();

        if (publishItems == null) {
            this.publishItems = new ArrayList<Item>();
        } else {
            this.publishItems = publishItems;
        }
    }


    public void addLike(User user) {
        this.likedUsers.add(user);
    }

    public void removeLike(User user) {
        this.likedUsers.remove(user);
    }

    public void publish(Item item) {
        this.publishItems.add(item);
    }

    public void unpublish(Item item) {
        this.publishItems.remove(item);
    }

    public void createItem(Item item, ItemHandler itemHandler, List<Tag> tags) {
        item.addTags(tags);
        for (Tag tag : tags) {
            tag.addItem(item);
        }
        itemHandler.addItem(item);
        itemHandler.addTags(tags);
        this.publish(item);
    }

    @Override
    public String toString() {
        return this.providerName;
    }
}

