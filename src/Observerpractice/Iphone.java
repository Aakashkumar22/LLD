package Observerpractice;

import java.util.ArrayList;
import java.util.List;

public class Iphone  implements  Observer{
    Observerservice observerservice;
    List<Observerservice>NotificationService=new ArrayList<>();

    @Override
    public void add(Observerservice observerservice) {
        NotificationService.add(observerservice);

    }

    @Override
    public void remove(Observerservice observerservice) {
        NotificationService.remove(observerservice);
    }

    @Override
    public void notifytoAllsubs() {
        NotificationService.forEach(Observerservice::update);

    }

    @Override
    public void setquantity(int quantity) {
        if(quantity<100){
            notifytoAllsubs();
        }

    }
}
