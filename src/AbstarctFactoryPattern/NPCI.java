package AbstarctFactoryPattern;

public class NPCI implements collectpayment{
    @Override
    public pay getpayment(String input) {
        switch (input){
            case "Phonepay":
                return new Phonepay();

            case "Bharatpe":
                return new Bharatpe();
            default:
                return null;
        }
    }
}
