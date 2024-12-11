package creational.abstractFactory.example2;

public class GoogleCloudResourceGenerator implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleCloudEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int mib) {
        return null;
    }
}
