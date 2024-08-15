package StrategyPattern;

public class Vechicle {
    Engine engine;
    Vechicle(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        engine.startEngine();
    }
}
