package item;

import user.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class ItemComments {
    private List<Comment> comments;

    public ItemComments(List<Comment> comments) {
        if (comments != null) {
            this.comments = comments;
        } else {
            this.comments = new ArrayList<Comment>();
        }
    }

    public int getCommentCount() {
        return this.comments.size();
    }

    public List<Comment> findComments(User user) {
        List<Comment> foundComments = new ArrayList<Comment>();
        for (Comment comment : this.comments) {
            if (comment.getSender().equals(user)) foundComments.add(comment);
        }
        return foundComments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void addComments(List<Comment> comments) {
        this.comments.addAll(comments);
    }

    public List<Comment> getComments() {
        return this.comments;
    }

}


