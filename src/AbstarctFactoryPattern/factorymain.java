package AbstarctFactoryPattern;

public class factorymain {
    public static void main(String[] args) {
        paymentMode p=new paymentMode();
        collectpayment mode=p.getpaymentmode("NPCI");
        pay p1=mode.getpayment("Bharatpe");
        p1.dopayment();

    }
}
