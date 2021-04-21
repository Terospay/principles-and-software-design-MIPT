package oop.query;

import oop.DataBase;
import oop.IResult;

public class PostQueryHandler implements IQueryHandler{
    private final DataBase db;

    public PostQueryHandler(DataBase db) {
        this.db = db;
    }

    public IResult readPost(IQuery message) {
        return db.readPost(message);
    }

    public IResult readPostComments(IQuery message) {
        return db.readPostComments(message);
    }
}
