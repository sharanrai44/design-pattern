package behavioural.command.example4;
//CONCRETE CLASS
public class DrawRectangle implements Command {

    private DrawShape drawShape;

    public DrawRectangle(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    @Override
    public void execute() {
        drawShape.drawRectangle();
    }
}
