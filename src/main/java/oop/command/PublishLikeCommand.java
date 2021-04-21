package oop.command;

public class PublishLikeCommand implements ICommand{
    private final int senderId;
    private final int postId;

    public PublishLikeCommand(int senderId, int postId) {
        this.senderId = senderId;
        this.postId = postId;
    }
}
