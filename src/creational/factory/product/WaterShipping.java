package creational.factory.product;

public class WaterShipping extends ShippingService{

    @Override
    public void ship() {
        System.out.println("Shipping the package by WATER!!!");
    }
}
