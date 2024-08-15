package Decorator;

public class Mushroom extends Toppins{
    BasePizza basePizza;
    Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return  this.basePizza.cost()+250;
    }
}
