package oop;

import oop.command.ICommand;
import oop.query.IQuery;

public interface DataBase {
    void createUser(ICommand command);
    void createPost(ICommand command);
    void publishLike(ICommand command);
    void publishComment(ICommand command);

    IResult readPost(IQuery query);
    IResult readPostComments(IQuery query);
}
