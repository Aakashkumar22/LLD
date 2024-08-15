package AbstarctFactoryPattern;

public class paymentMode {
    collectpayment getpaymentmode(String input){
        switch (input){
            case "NPCI":
                return new NPCI();

            case "ForenUPI":
                return new ForenUPI();

            default:
                return null;
        }

    }
}
