package creational.abstractFactory.example2;

//Represents Concrete Product in a family "Google Cloud "
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated"+capacityInMib+" in google cloud storage");
    }

    @Override
    public String getId() {
        return " gcp1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
