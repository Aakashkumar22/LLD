package AbstarctFactoryPattern;

public class ForenUPI implements collectpayment{
    @Override
    public pay getpayment(String input) {
        switch (input){
            case "Gpay":
                return  new Gpay();
            default:
                return  null;
        }
    }
}
