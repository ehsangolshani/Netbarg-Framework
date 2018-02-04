package management;

import item.Item;
import item.ItemHandler;
import payment.PaymentHandler;
import user.UserHandler;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class NetbargManager {
    private ItemHandler itemHandler;
    private UserHandler userHandler;
    private PaymentHandler paymentHandler;
    private CreateRowStrategy createRowStrategy;


    public NetbargManager(ItemHandler itemHandler, UserHandler userHandler,
                          PaymentHandler paymentHandler, CreateRowStrategy createRowStrategy) {
        this.itemHandler = itemHandler;
        this.userHandler = userHandler;
        this.paymentHandler = paymentHandler;
        this.createRowStrategy = createRowStrategy;
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

    public List<Item> createRow() {
        return this.createRowStrategy.createRow(this.itemHandler.getItems().iterator());
    }

    ;

}
