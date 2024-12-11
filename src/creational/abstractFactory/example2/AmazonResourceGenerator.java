package creational.abstractFactory.example2;

public class AmazonResourceGenerator implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int mib) {
        return new S3Storage(mib);
    }

    @Override
    public String toString() {
        return "Amazon Resource Generator";
    }
}
