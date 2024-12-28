package Inventory_Managemet_System_Zepto;

public class Payment {
    PaymentStrategy paymentStrategy;
    Payment(PaymentStrategy pst){
        this.paymentStrategy=pst;
    }

    public boolean  makepayby(){
        return paymentStrategy.makepayby();
    }
}
