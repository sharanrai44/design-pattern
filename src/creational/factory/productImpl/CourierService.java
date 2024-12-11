package creational.factory.productImpl;

import creational.factory.product.ShippingService;

public abstract class CourierService {
   public  abstract ShippingService deliveryItem();

   public ShippingService getDeliverItem(){
       ShippingService shippingService = deliveryItem();
       System.out.println("Quality Check  in  progress");
       return shippingService;
   }

}
