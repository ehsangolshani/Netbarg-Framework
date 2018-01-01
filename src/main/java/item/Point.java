package item;

import user.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Point {
    private double value;
    private User sender;

    public Point(double value, User sender) {
        this.value = value;
        this.sender = sender;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}
