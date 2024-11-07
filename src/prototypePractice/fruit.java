package prototypePractice;

public class fruit implements fruitprototype {
    String name;
    Double price;
    String color;
    Double richness;

    fruit(String name,Double price,String color,Double richness){
        this.name=name;
        this.price=price;
        this.color=color;
        this.richness=richness;
    }

    @Override
    public fruitprototype clone() {
        return new fruit(name,price,color,richness);
    }
}
