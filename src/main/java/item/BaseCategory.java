package item;

/**
 * Created by ehsangolshani on 12/31/17.
 */
public class BaseCategory implements Category {
    private String name;

    public BaseCategory(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
