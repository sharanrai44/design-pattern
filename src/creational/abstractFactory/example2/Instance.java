package creational.abstractFactory.example2;

public interface Instance {
    enum Capacity{micro,small,large}
    void start();
    void stop();
    void attachStorage(Storage storage);
}
