package oop.command;

public class CreateUserCommand implements ICommand{
    private final String userName;
    private final int id;


    public CreateUserCommand(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }
}
