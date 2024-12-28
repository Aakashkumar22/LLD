package Inventory_Managemet_System_Zepto;

import java.util.Map;

public class Order {
    User user;
    Invoice invoice;
    Payment payment;
    Map<Integer,Integer>totalItems;
    DeliveryPartner partner;
    Warehouse warehouse;

    Order(User user,Warehouse wh){
        this.user=user;
        this.warehouse=wh;
        this.totalItems=user.userItems.getcart();
        Invoice i=new Invoice();
        i.generateInvoice(this);

    }




}
