package creational.factory.productImpl;

import creational.factory.product.AirShipping;
import creational.factory.product.ShippingService;

public class FlightCourier extends CourierService{
    @Override
    public ShippingService deliveryItem() {
        return new AirShipping();
    }
}
