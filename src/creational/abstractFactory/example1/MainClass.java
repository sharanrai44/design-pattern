package creational.abstractFactory.example1;

public class MainClass {
    private Button button;
    private CheckBox checkBox;

    public MainClass(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public static void main(String[] args) {
        GUIFactory guiFactory = createFactory("mac");
        MainClass app = new MainClass(guiFactory);
        app.renderUI();
    }

    public static GUIFactory createFactory(String os) {
        if (os.equals("windows")) {
            return new WindowsGuiFactory();
        } else if (os.equals("mac")) {
            return new MacOsGUIFactory();
        }
        return null;
    }

    void renderUI() {
        button.render();
        checkBox.render();
    }
}
