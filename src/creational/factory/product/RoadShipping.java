package creational.factory.product;

public class RoadShipping extends ShippingService{
    @Override
    public void ship() {
        System.out.println(" Shipping the package by Road!!!");
    }
}
