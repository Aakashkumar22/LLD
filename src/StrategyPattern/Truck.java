package StrategyPattern;

public class Truck extends Vechicle{
    Truck() {
        super(new diesalStrategy());
    }
}
