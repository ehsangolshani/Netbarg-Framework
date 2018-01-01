import item.ItemHandler;
import user.UserHandler;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class NetbargManager {
    private static NetbargManager instance = new NetbargManager();
    private ItemHandler itemHandler;
    private UserHandler userHandler;


    public static NetbargManager getInstance() {
        return instance;
    }

    private NetbargManager() {
    }

    public ItemHandler getItemHandler() {
        return itemHandler;
    }

    public void setItemHandler(ItemHandler itemHandler) {
        this.itemHandler = itemHandler;
    }

    public UserHandler getUserHandler() {
        return userHandler;
    }

    public void setUserHandler(UserHandler userHandler) {
        this.userHandler = userHandler;
    }
}
