package Observer;

public interface Observable {

    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void  NotifyToAllsubscribers();
    void setquqntity(int incomingquantity);


}
