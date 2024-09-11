package SnakeandLadderPractice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int dicecount;
    Dice(int dicecount){
        this.dicecount=dicecount;
    }

    int rolldice(){
        int totalsum=0;
        int dicerolls=0;
        while(dicerolls<dicecount){
            totalsum+= ThreadLocalRandom.current().nextInt(1,7);
            dicerolls++;
        }
        return totalsum;
    }
}
