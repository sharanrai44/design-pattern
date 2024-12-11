package creational.abstractFactory.example2;

//Represents Concrete Product in a family "Amazon Cloud"
public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity) {
        System.out.println("creating EC2 instance with capacity "+capacity);
    }

    @Override
    public void start() {
        System.out.println("Create EC2 Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped EC2 Instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached"+storage+"to EC2 Instance");
    }

    @Override
    public String toString() {
        return "Ec2Instance{}";
    }
}
