package Decorator;

public class corn extends  Toppins{
    BasePizza basePizza;
    corn(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
