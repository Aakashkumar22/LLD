package StrategyPattern;

public class ElectricStrategy implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Starting Electric engine");
    }
}
