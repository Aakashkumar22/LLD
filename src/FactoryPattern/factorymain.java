package FactoryPattern;

public class factorymain {
    public static void main(String[] args) {
        payfatory p=new payfatory();
        pay paywith=p.getpayment("Gpay");
        paywith.dopayment();
    }
}
