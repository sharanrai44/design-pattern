package creational.singletone;

public class LazySingleton2 {
    private LazySingleton2() {
        System.out.println(" Constructor is called");
    }

    private static class RegistryHolder {
        static LazySingleton2 INSTANCE= new LazySingleton2();
    }

    public static LazySingleton2 getInstance(){
      return  RegistryHolder.INSTANCE;
    }
}
