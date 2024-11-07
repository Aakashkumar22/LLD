package DecoratorPractie;

public class mushroom extends Toppins{
    BasePizza basePizza;

    mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+500;
    }
}
