package creational.factory.productImpl;

import creational.factory.product.RoadShipping;
import creational.factory.product.ShippingService;

public class TruckCourier extends CourierService{
    @Override
    public ShippingService deliveryItem() {
        return new RoadShipping();
    }
}
