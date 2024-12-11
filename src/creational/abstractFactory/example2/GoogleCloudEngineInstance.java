package creational.abstractFactory.example2;

//Represents Concrete Product in a family "Google Cloud "
public class GoogleCloudEngineInstance implements Instance {
    public GoogleCloudEngineInstance(Capacity capacity) {
        System.out.println("creating google cloud instance with capacity " + capacity);

    }

    @Override
    public void start() {
        System.out.println(" Started Google Cloud Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println(" Stopped Google Cloud Engine Instance!!!");

    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached" + storage + "to  Google Cloud Engine Instance");
    }

    @Override
    public String toString() {
        return "GoogleCloudEngineInstance{}";
    }
}
