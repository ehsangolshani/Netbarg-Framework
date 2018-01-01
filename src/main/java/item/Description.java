package item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Description {
    private List<String> properties;

    public Description(List<String> properties) {
        if (properties != null) {
            this.properties = properties;
        } else {
            this.properties = new ArrayList<String>();
        }
    }

    public String getProperty(int index) {
        return properties.get(index);
    }

    public void addProperty(String property) {
        this.properties.add(property);
    }

    public List<String> getProperties() {
        return properties;
    }

    public void addProperties(List<String> properties) {
        this.properties.addAll(properties);
    }
}
