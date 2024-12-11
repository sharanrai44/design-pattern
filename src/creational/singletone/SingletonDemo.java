package creational.singletone;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(" EagerSingleton example START ***********************");
        EagerSingleton eagerInstance1 = EagerSingleton.getInstance();
        System.out.println(eagerInstance1);

        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();
        System.out.println(eagerInstance1);

        System.out.println("eagerInstance1.equals(eagerInstance2) :"+eagerInstance1.equals(eagerInstance2));
        System.out.println(" EagerSingleton example  END  ***********************");

        System.out.println();
        System.out.println();

        System.out.println("###########################Lazy Singletone example1 STARTs here");
        LazySingleton1 lazySingleton1Instance1=LazySingleton1.getInstance();
        LazySingleton1 lazySingleton1Instance2=LazySingleton1.getInstance();
        System.out.println(lazySingleton1Instance1);
        System.out.println(lazySingleton1Instance2);
        System.out.println("lazySingleton1Instance1.equals(lazySingleton1Instance2) :"+lazySingleton1Instance1.equals(lazySingleton1Instance2));

        System.out.println();
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Lazy Singletone example2 ENDs here~~~~~~~~~~~~~~~~~");
        LazySingleton2 lazySingleton2Instance1=LazySingleton2.getInstance();
        LazySingleton2 lazySingleton2Instance2=LazySingleton2.getInstance();
        System.out.println(lazySingleton2Instance1);
        System.out.println(lazySingleton2Instance2);
        System.out.println("lazySingleton2Instance1.equals(lazySingleton2Instance2) :"+lazySingleton2Instance1.equals(lazySingleton2Instance2));
        System.out.println("---------Lazy Singletone example2 ENDs here-------------");

    }
}
