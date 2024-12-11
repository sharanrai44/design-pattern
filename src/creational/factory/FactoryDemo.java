package creational.factory;

import creational.factory.product.ShippingService;
import creational.factory.productImpl.FlightCourier;
import creational.factory.productImpl.BoatCourier;
import creational.factory.productImpl.CourierService;
import creational.factory.productImpl.TruckCourier;

public class FactoryDemo {
    public static void main(String[] args) {
        deliverAnItem(new TruckCourier());
        deliverAnItem(new FlightCourier());
        deliverAnItem(new BoatCourier());
    }

    private static void deliverAnItem(CourierService courierService) {
        ShippingService deliverItem = courierService.getDeliverItem();
        deliverItem.ship();

    }
}
