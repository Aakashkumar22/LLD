package Observerpractice;

public class main {
    public static void main(String[] args) {
        Observer iphonestock=new Iphone();
        Observerservice n1=new Emailservice("aakahcu22@gmail.com",iphonestock);
        Observerservice n2= new Phoneservice("70603908720",iphonestock);
        iphonestock.add(n1);
        iphonestock.add(n2);
        iphonestock.notifytoAllsubs();
        iphonestock.setquantity(100);

    }
}
