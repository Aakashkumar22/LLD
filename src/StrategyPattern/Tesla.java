package StrategyPattern;

public class Tesla extends Vechicle{
    Tesla() {
        super(new ElectricStrategy());
    }
}
