package Observer;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Observable{
    NotificationObserver notificationObserver;
    List<NotificationObserver>notificationObserverList=new ArrayList<>();
    int presentquantity=99;
    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);

    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);

    }

    @Override
    public void NotifyToAllsubscribers() {

       for(NotificationObserver Noticationl:notificationObserverList){
           Noticationl.update();
       }

    }



    @Override
    public void setquqntity(int incomingquantity) {
        int finalquantity=presentquantity+incomingquantity;
        if(finalquantity<100){
            NotifyToAllsubscribers();
        }
        presentquantity=finalquantity;

    }
}
