package behavioural.command.example4;
//CONCRETE CLASS
public class DrawCircle implements Command {

    private DrawShape drawShape;

    public DrawCircle(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    @Override
    public void execute() {
        drawShape.drawCircle();
    }
}
