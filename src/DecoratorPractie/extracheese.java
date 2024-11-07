package DecoratorPractie;

public class extracheese extends  Toppins{
    BasePizza basePizza;
    extracheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+300;
    }
}
