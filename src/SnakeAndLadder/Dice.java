package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min=1;
    int max=6;
    Dice(int diceCount){
        this.diceCount=diceCount;
    }

    int rolldice(){
        int totalsum=0;
        int dicscrolls=0;
        while(dicscrolls<diceCount){
            totalsum+= ThreadLocalRandom.current().nextInt(1,7);
            dicscrolls++;
        }
        return totalsum;
    }
}
