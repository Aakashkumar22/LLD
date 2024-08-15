package Decorator;

public class cheese extends Toppins{
    BasePizza basePizza;
    cheese(BasePizza basePizza){
        this.basePizza=basePizza;

    }
    @Override
    public int cost() {
        return this.basePizza.cost()+340;
    }
}
