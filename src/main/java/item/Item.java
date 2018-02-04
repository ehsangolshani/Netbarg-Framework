package item;

import category.BaseCategory;
import user.Provider;
import user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Item {
    private String code;
    private Provider provider;
    private BaseCategory category;
    private Specification specification;
    private TermOfUse termOfUse;
    private Description description;
    private double defaultCost;
    private double discountPercent;
    private String region;
    private Date registrationDate;
    private Date startDate;
    private Date finishDate;
    private String longitude;
    private String latitude;
    private List<Tag> tags;
    private List<User> likedUsers;
    private ItemComments comments;
    private ItemPoints points;
    private boolean isSpecialOffer;


    public Item(String code, Provider provider, BaseCategory category, Specification specification, TermOfUse termOfUse, Description description, double defaultCost, double discountPercent, String region, Date registrationDate, Date startDate, Date finishDate, String longitude, String latitude, List<Tag> tags, ItemComments comments, ItemPoints points, boolean isSpecialOffer) {
        this.code = code;
        this.provider = provider;
        this.category = category;
        this.specification = specification;
        this.termOfUse = termOfUse;
        this.description = description;
        this.defaultCost = defaultCost;
        this.discountPercent = discountPercent;
        this.region = region;
        this.registrationDate = registrationDate;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.longitude = longitude;
        this.latitude = latitude;

        if (tags == null) {
            this.tags = new ArrayList<Tag>();
        } else {
            this.tags = tags;
        }

        this.likedUsers = new ArrayList<User>();
        this.comments = comments;
        this.points = points;
        this.isSpecialOffer = isSpecialOffer;

    }

    public void sellOut(User user) {
        //todo
    }

    public Double calculateCost() {
        return this.defaultCost - (this.discountPercent * this.defaultCost) / 100;
    }

    public void addLike(User user) {
        this.likedUsers.add(user);
    }

    public void removeLike(User user) {
        this.likedUsers.remove(user);
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public void addTags(List<Tag> tags) {
        this.tags.addAll(tags);
    }

    public void removeTag(Tag tag) {
        this.tags.remove(tag);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public BaseCategory getCategory() {
        return category;
    }

    public void setCategory(BaseCategory category) {
        this.category = category;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public TermOfUse getTermOfUse() {
        return termOfUse;
    }

    public void setTermOfUse(TermOfUse termOfUse) {
        this.termOfUse = termOfUse;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public double getDefaultCost() {
        return defaultCost;
    }

    public void setDefaultCost(double defaultCost) {
        this.defaultCost = defaultCost;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public List<User> getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(List<User> likedUsers) {
        this.likedUsers = likedUsers;
    }

    public ItemComments getComments() {
        return comments;
    }

    public void setComments(ItemComments comments) {
        this.comments = comments;
    }

    public ItemPoints getPoints() {
        return points;
    }

    public void setPoints(ItemPoints points) {
        this.points = points;
    }

    public boolean isSpecialOffer() {
        return isSpecialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        isSpecialOffer = specialOffer;
    }
}

