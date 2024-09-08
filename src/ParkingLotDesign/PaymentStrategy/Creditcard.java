package ParkingLotDesign.PaymentStrategy;

public class Creditcard implements PaymentMode{
    @Override
    public void doPayment() {
        System.out.println(" Created Payment by CreditCard");
    }
}
