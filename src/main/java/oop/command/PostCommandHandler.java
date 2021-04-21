package oop.command;
import oop.DataBase;

public class PostCommandHandler implements ICommandHandler{
    private final DataBase db;

    public PostCommandHandler(DataBase db) {
        this.db = db;
    }

    public void execute(CreatePostCommand message) {
        db.createPost(message);
    }

    public void execute(PublishLikeCommand message) {
        db.publishLike(message);
    }

    public void execute(PublishCommentCommand message) {
        db.publishComment(message);
    }


}
