package DecoratorPractie;

public class garlic extends  Toppins{

    BasePizza basePizza;
    garlic(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }
}
