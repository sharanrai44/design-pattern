package creational.abstractFactory.example2;

//Represents Concrete Product in a family "Amazon web services"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" in S3 storage");
    }

    @Override
    public String getId() {
        return "s312313";
    }

    @Override
    public String toString() {
        return " S3 Storage";
    }
}
