package Observer;

public class mainObserver {
    public static void main(String[] args) {
        Observable Iphonestock=new Iphone();
        NotificationObserver n1=new Mobileservice("7060390720",Iphonestock);
        NotificationObserver n2=new Emailservice("aakashakay222@gmail.com",Iphonestock);

        Iphonestock.add(n1);
        Iphonestock.add(n2);
        Iphonestock.setquqntity(0);
    }
}
