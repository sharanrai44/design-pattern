package creational.factory.product;

public class AirShipping extends ShippingService{
    @Override
    public void ship() {
        System.out.println("Shipping the package by AIR!!!!!");
    }
}
