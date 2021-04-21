package oop.command;
import oop.DataBase;

public class UserCommandHandler implements ICommandHandler{
    private final DataBase db;

    public UserCommandHandler(DataBase db) {
        this.db = db;
    }

    public void execute(CreateUserCommand message) {
        db.createUser(message);
    }
}
