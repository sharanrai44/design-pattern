package creational.abstractFactory.example2;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int mib);
}
