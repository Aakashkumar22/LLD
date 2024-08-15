package FactoryPattern;

public class payfatory {
    pay getpayment( String input){
        switch (input){
            case  "Gpay":
                return new Gpay();

            case "phonepay":
                return new Phonepay();

            case "Bharatpe":
                return new Bharatpe();

            default:
                return null;
        }
    }
}
