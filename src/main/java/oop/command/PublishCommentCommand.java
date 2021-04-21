package oop.command;

public class PublishCommentCommand implements ICommand{
    private final int senderId;
    private final int postId;
    private final String comment;

    public PublishCommentCommand(int senderId, int postId, String comment) {
        this.senderId = senderId;
        this.postId = postId;
        this.comment = comment;
    }
}
