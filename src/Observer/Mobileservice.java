package Observer;

public class Mobileservice implements NotificationObserver{
    String phoneNo;
    Observable observable;
    Mobileservice(String phoneNo,Observable observable){
        this.phoneNo=phoneNo;
        this.observable=observable;
    }
    @Override
    public void update() {
        senMessage();

    }

    public void senMessage(){
        System.out.println("notifying the subsriber with "+phoneNo);
    }
}
