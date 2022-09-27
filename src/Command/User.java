package Command;

public class User {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    void execute(){
        command.execute();
    }


}
