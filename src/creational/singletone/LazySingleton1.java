package creational.singletone;

public class LazySingleton1 {

    private LazySingleton1() {
    }

    private static volatile LazySingleton1 INSTANCE;

    public static LazySingleton1 getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton1.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton1();
                }
            }
        }
        return INSTANCE;
    }
}
