package Observer;

public class Emailservice implements NotificationObserver{

    String username;
    Observable observable;
    Emailservice(String username,Observable observable){
        this.username=username;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendUpdate();

    }
    void sendUpdate(){
        System.out.println("sending notification to "+username);
    }
}
