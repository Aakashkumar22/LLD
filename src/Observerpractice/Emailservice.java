package Observerpractice;

public class Emailservice implements  Observerservice {
    String email;
    Observer observer;

    Emailservice(String email,Observer observer){
        this.email=email;
        this.observer=observer;
    }


    @Override
    public void update() {
        print();
    }

    void print(){
        System.out.println("Sending email to "+email+" successfully");
    }
}
