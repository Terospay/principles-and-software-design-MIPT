package oop.query;

public class ReadPostCommentsQuery implements IQuery{
    private final int postId;

    public ReadPostCommentsQuery(int postId) {
        this.postId = postId;
    }
}
