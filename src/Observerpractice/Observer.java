package Observerpractice;

public interface Observer {

    void add(Observerservice observerservice);
    void remove(Observerservice observerservice);
    void notifytoAllsubs();
    void setquantity(int quantity);
}
