package ParkingLotDesign.PaymentStrategy;

public class UPI implements PaymentMode{
    @Override
    public void doPayment() {
        System.out.println(" Payment is created by UPI");
    }
}
