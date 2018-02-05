import item.*;
import management.CreateBestSellerRow;
import management.NetbargManager;
import payment.DefaultPurchase;
import payment.PaymentHandler;
import search.ItemSearchByTag;
import search.PopularItemFinder;
import search.Search;
import user.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ehsangolshani on 2/5/18.
 */
public class Test {
    public static void main(String[] args) {
        //      creating categories
        CompositeCategory customCompositeCategory = new CompositeCategory("netbarg general category");

        BaseCategory sportsCategory = new BaseCategory("sports");
        BaseCategory restaurantCategory = new BaseCategory("restaurant");
        BaseCategory entertainmentCategory = new BaseCategory("entertainment");
        BaseCategory healthCareCategory = new BaseCategory("healthCare");

        customCompositeCategory.addCategory(sportsCategory);
        customCompositeCategory.addCategory(restaurantCategory);
        customCompositeCategory.addCategory(entertainmentCategory);
        customCompositeCategory.addCategory(healthCareCategory);


        //        creating users
        User ehsan = new User(new Account("1", "1"),
                "ehsan", "golshani", "1@1.gmail.com",
                "09121111111", "0018023133", Gender.Male,
                15000.0, new DefaultPurchase());

        User ali = new User(new Account("1", "1"),
                "ali", "ali", "1@1.gmail.com",
                "09121111111", "0018023133", Gender.Male,
                000.0, new DefaultPurchase());

        User jasem = new User(new Account("1", "1"),
                "jasem", "jasemi", "1@1.gmail.com",
                "09121111111", "0018023133", Gender.Male,
                10000.0, new DefaultPurchase());

        User zahra = new User(new Account("1", "1"),
                "zahra", "zahrai", "1@1.gmail.com",
                "09121111111", "0018023133", Gender.Male,
                10000.0, new DefaultPurchase());

        //        creating providers
        Provider ehsanCo = new Provider(ehsan, "ehsanCo", "ehsanCo alley", "Tehran", "59.96", "34.76", null);
        Provider jasemCo = new Provider(ehsan, "jasemCo", "jasemCo alley", "Tehran", "59.96", "34.76", null);

        //        creating items Specification
        Specification sportSpecification1 = new Specification(null);
        Specification sportSpecification2 = new Specification(null);

        Specification restaurantSpecification1 = new Specification(null);

        Specification healthCareSpecification1 = new Specification(null);
        Specification healthCareSpecification2 = new Specification(null);
        Specification healthCareSpecification3 = new Specification(null);

        sportSpecification1.addProperty("this is sportSpecification1");
        sportSpecification2.addProperty("this is sportSpecification2");

        restaurantSpecification1.addProperty("this is restaurantSpecification1");

        healthCareSpecification1.addProperty("this is healthCareSpecification1");
        healthCareSpecification1.addProperty("this is healthCareSpecification1 additional");
        healthCareSpecification2.addProperty("this is healthCareSpecification2");
        healthCareSpecification3.addProperty("this is healthCareSpecification3");

        //        creating items TermOfUse
        TermOfUse sportTermOfUse1 = new TermOfUse(null);
        TermOfUse sportTermOfUse2 = new TermOfUse(null);

        TermOfUse restaurantTermOfUse1 = new TermOfUse(null);

        TermOfUse healthCareTermOfUse1 = new TermOfUse(null);
        TermOfUse healthCareTermOfUse2 = new TermOfUse(null);
        TermOfUse healthCareTermOfUse3 = new TermOfUse(null);

        //        creating items Description
        Description sportDescription1 = new Description(null);
        Description sportDescription2 = new Description(null);

        Description restaurantDescription1 = new Description(null);

        Description healthCareDescription1 = new Description(null);
        Description healthCareDescription2 = new Description(null);
        Description healthCareDescription3 = new Description(null);

        //        creating tags
        Tag tag1 = new Tag("tag1", null);
        Tag tag2 = new Tag("tag2", null);
        Tag tag3 = new Tag("tag3", null);

        //        creating items
        Item sportItem1 = new Item("eek4", ehsanCo, sportsCategory, sportSpecification1, sportTermOfUse1,
                sportDescription1, 1500.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);

        sportItem1.addTag(tag1);
        sportItem1.addTag(tag2);
        sportItem1.addTag(tag3);

        Item sportItem2 = new Item("eekgjg4", ehsanCo, sportsCategory, sportSpecification2, sportTermOfUse2,
                sportDescription2, 1400.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);

        sportItem2.addTag(tag1);


        Item restaurantItem1 = new Item("egbfek4", jasemCo, restaurantCategory, restaurantSpecification1, restaurantTermOfUse1,
                restaurantDescription1, 1500.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);

        restaurantItem1.addTag(tag1);
        restaurantItem1.addTag(tag2);
        restaurantItem1.addTag(tag3);


        Item healthCareItem1 = new Item("eevfvk4", ehsanCo, healthCareCategory, healthCareSpecification1, healthCareTermOfUse1,
                healthCareDescription1, 1500.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);

        Item healthCareItem2 = new Item("eekdcd4", jasemCo, healthCareCategory, healthCareSpecification2, healthCareTermOfUse2,
                healthCareDescription2, 1500.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);

        Item healthCareItem3 = new Item("eecdck4", ehsanCo, healthCareCategory, healthCareSpecification3, healthCareTermOfUse3,
                healthCareDescription3, 1500.0, 5.0, "akbar abad", null,
                null, null, "59.96", "34.76", null, false);


        //        creating handlers
        UserHandler userHandler = new UserHandler();

        userHandler.addUser(ehsan);
        userHandler.addUser(ali);
        userHandler.addUser(jasem);
        userHandler.addUser(zahra);

        userHandler.addProvider(ehsanCo);
        userHandler.addProvider(jasemCo);


        ItemHandler itemHandler = new ItemHandler(customCompositeCategory);

        itemHandler.addItem(sportItem1);
        itemHandler.addItem(sportItem2);
        itemHandler.addItem(restaurantItem1);
        itemHandler.addItem(healthCareItem1);
        itemHandler.addItem(healthCareItem2);
        itemHandler.addItem(healthCareItem3);


        PaymentHandler paymentHandler = new PaymentHandler(null);

        //        creating search component
        Search search = new Search(itemHandler, new ItemSearchByTag(), new PopularItemFinder());

        //        creating netbarg manager
        NetbargManager netbargManager = new NetbargManager(itemHandler, userHandler, paymentHandler, new CreateBestSellerRow());

        //        test like feature
        System.out.println("test like feature:");

        ehsan.like(sportItem1);
        jasem.like(sportItem1);
        ali.like(sportItem1);
        zahra.like(restaurantItem1);
        ali.like(restaurantItem1);

        System.out.println(ali.getWishList());
        System.out.println();


        //        test point feature
        ehsan.addPoint(new Point(19, ehsan), restaurantItem1);
        jasem.addPoint(new Point(5, ehsan), sportItem2);
        jasem.addPoint(new Point(19, ehsan), sportItem1);


        //        test comment feature
        ehsan.addComment(new Comment("testii comment", ehsan, null), restaurantItem1);

        System.out.println("test comment feature:");
        System.out.println(restaurantItem1.getComments().getComments());
        System.out.println();


        //        test search feature
        System.out.println("test search feature:");
        System.out.println(search.searchItems("tag2", search.getItemHandler().getItems()));
        System.out.println();

        //        test find feature
        System.out.println("test find feature:");
        System.out.println(search.findItems(search.getItemHandler().getItems()));
        System.out.println();

        //        test login-logout feature
        System.out.println("test login-logout feature:");
        System.out.println("is login: " + ehsan.isLoginStatus());
        ehsan.login("1111", "111");
        System.out.println("is login: " + ehsan.isLoginStatus());
        ehsan.login("1", "1");
        System.out.println("is login: " + ehsan.isLoginStatus());
        ehsan.logout();
        System.out.println("is login: " + ehsan.isLoginStatus());
        System.out.println();

        //        test shopping card and purchase feature
        System.out.println("test shopping card and purchase feature:");

        ehsan.addToShoppingCart(healthCareItem1);
        ehsan.addToShoppingCart(healthCareItem2);
        ehsan.addToShoppingCart(restaurantItem1);

        ehsan.purchase(ehsan.getShoppingCart().getItems(), "golden code", paymentHandler);
        System.out.println("bought items: " + ehsan.getPurchasedItems());
        System.out.println();

        //        test report transactions feature
        System.out.println("test report transactions feature:");
        zahra.purchase(new ArrayList<Item>(Arrays.asList(restaurantItem1)), "fake code", paymentHandler);
        System.out.println(paymentHandler.getTransactions());
        System.out.println();

        //        test create row feature
        System.out.println("test create row feature:");
        System.out.println("best seller row: " + netbargManager.createRow());
        System.out.println();
    }
}
