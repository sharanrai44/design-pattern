package behavioural.command.example4;


public class Client {
    public static void main(String[] args) {
        SketchBoard sketchBoard= new SketchBoard();
        DrawShape drawShape= new DrawShape();

        Command drawCircleCommand= new DrawCircle(drawShape);
        sketchBoard.setCommand(drawCircleCommand);
        sketchBoard.drawTheShape();
        
        Command drawRectangle= new DrawRectangle(drawShape);
        sketchBoard.setCommand(drawRectangle);
        sketchBoard.drawTheShape();
    }
}
