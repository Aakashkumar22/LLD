package StrategyPractice2;

public class fruit {

    SellingStrategy fruitSellingStrategy;

    fruit(SellingStrategy fruitSellingStrategy){
        this.fruitSellingStrategy=fruitSellingStrategy;
    }


    void sell(){
        fruitSellingStrategy.sellwith();
    }
}
