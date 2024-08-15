package StrategyPattern;

public class petrolStrategy implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Starting petrol engine");
    }
}
