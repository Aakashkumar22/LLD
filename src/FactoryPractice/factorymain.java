package FactoryPractice;

public class factorymain {
    public static void main(String[] args) {
        finalshape f= new finalshape();
        shape s=f.getshape("circle");
        s.draw();
    }
}
