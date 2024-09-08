package ParkingLotDesign.PaymentStrategy;

public class DebitCard  implements  PaymentMode{
    @Override
    public void doPayment() {
        System.out.println(" payment is created by DebitCard");
    }
}
