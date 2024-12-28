package Inventory_Managemet_System_Zepto;

import java.util.Map;

public class Order {
    private int orderID;
    private User user;
    private Invoice invoice;
    private Payment payment;
    private Map<Integer,Integer>totalItems;
    private DeliveryPartner partner;


}
