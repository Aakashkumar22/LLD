package StrategyPattern;

public class car extends Vechicle{

    car() {
        super( new petrolStrategy());
    }
}
