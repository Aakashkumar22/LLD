package StrategyPattern;

public class diesalStrategy implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Starting Diesal Engine");
    }
}
