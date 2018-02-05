package item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 12/31/17.
 */
public class CompositeCategory implements Category {
    private String name;
    private List<Category> subCategories;

    public CompositeCategory(String name) {
        this.setName(name);
        this.subCategories = new ArrayList<Category>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCategory(Category category) {
        this.subCategories.add(category);
    }

    public void removeCategory(Category category) {
        this.subCategories.remove(category);
    }

    public List<Category> getSubCategories(Category category) {
        return this.subCategories;
    }
}
