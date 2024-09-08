package ParkingLotDesign.PaymentStrategy;

public class Cash implements  PaymentMode{
    @Override
    public void doPayment() {
        System.out.println(" Created payment by CashMode");
    }
}
