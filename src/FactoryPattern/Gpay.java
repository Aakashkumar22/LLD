package FactoryPattern;

public class Gpay implements pay{
    @Override
    public void dopayment() {
        System.out.println("paying with Gpay");
    }
}
