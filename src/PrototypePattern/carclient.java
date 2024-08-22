package PrototypePattern;

public class carclient {
    public static void main(String[] args) {
        car c=new car("BMW i8","BMW","2020",34);
        car c1= (car)c.makeclone();
        c1.price=230000.00;
        c1.color="Black";
        System.out.println(c1);

        car c2=(car)c.makeclone();
        c2.color="Blue";
        c2.price=56000.0034;
        System.out.println(c2);


    }
}
