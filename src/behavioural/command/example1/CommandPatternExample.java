package behavioural.command.example1;

public class CommandPatternExample {
    public static void main(String[] args) {
        Light livingRoomLight= new Light();

        TurnOnCommand turnOnCommand = new TurnOnCommand(livingRoomLight);
        TurnOffCommand turnOffCommand = new TurnOffCommand(livingRoomLight);
        RemoteControl remoteControl= new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}
