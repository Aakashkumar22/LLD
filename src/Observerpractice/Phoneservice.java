package Observerpractice;

public class Phoneservice implements  Observerservice {

    String phoneNo;
    Observer observer;

   Phoneservice(String phoneNo,Observer observer){
        this.phoneNo=phoneNo;
        this.observer=observer;
    }


    @Override
    public void update() {
        print();
    }

    void print(){
        System.out.println("Sending updateto "+phoneNo+" successfully");
    }

}
