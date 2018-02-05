package item;

import user.User;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class Comment {
    private String text;
    private User sender;
    private String response;

    public Comment(String text, User sender, String response) {
        this.text = text;
        this.sender = sender;
        this.response = response;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return this.text;
    }
}