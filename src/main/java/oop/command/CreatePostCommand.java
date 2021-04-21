package oop.command;

import java.awt.image.BufferedImage;

public class CreatePostCommand implements ICommand{
    private final int userId;
    private final int postId;
    private final String postInfo;
    private final BufferedImage image;


    public CreatePostCommand(int userId, int postId, String postInfo, BufferedImage image) {
        this.userId = userId;
        this.postId = postId;
        this.postInfo = postInfo;
        this.image = image;
    }
}
