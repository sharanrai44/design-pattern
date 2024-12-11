package creational.factory.productImpl;

import creational.factory.product.ShippingService;
import creational.factory.product.WaterShipping;

public class BoatCourier extends CourierService{
    @Override
    public ShippingService deliveryItem() {
        return new WaterShipping();
    }
}
