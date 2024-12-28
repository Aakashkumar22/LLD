package Inventory_Managemet_System_Zepto;

public class Invoice {
    int price;
    Double Gst;
    Double finalprice;

    void generateInvoice(Order order){
        price=100;
        Gst=1.50;
        finalprice=price*Gst;
    }
}
