package behavioural.command.example1;

public class RemoteControl {
    private  Command command;


    public  void pressButton(){
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
