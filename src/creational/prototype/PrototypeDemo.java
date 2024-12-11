package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car= new Creta();
        System.out.println(car);
        Car clonedCar = car.clone();
        System.out.println("clonedCar   :: "+clonedCar);
        clonedCar.reset();
        System.out.println(clonedCar);

        EvCar evCar= new EvCar();
        evCar.reset();
        System.out.println(evCar);
        EvCar clone = evCar.clone();
        System.out.println(clone);


    }



}
