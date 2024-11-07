package DecoratorPractie;

public class main {
    public static void main(String[] args) {
        BasePizza bp= new mushroom(new  peppypaneer());
        System.out.println(bp.cost());
    }
}
