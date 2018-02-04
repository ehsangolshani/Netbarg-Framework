package user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class UserHandler {
    private static UserHandler instance = new UserHandler();
    private List<User> users;
    private List<Provider> providers;

    public static UserHandler getInstance() {
        return instance;
    }

    private UserHandler() {
        users = new ArrayList<User>();
        providers = new ArrayList<Provider>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void addProvider(Provider provider) {
        this.providers.add(provider);
    }

    public void removeProvider(Provider provider) {
        this.providers.remove(provider);
    }

    public List<Provider> getProviders() {
        return this.providers;
    }


}
