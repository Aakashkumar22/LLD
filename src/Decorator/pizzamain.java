package Decorator;

public class pizzamain {
    public static void main(String[] args) {
        BasePizza pizza=  new corn(new cheese(new Maheratha()));
        System.out.println(pizza.cost());
    }
}
