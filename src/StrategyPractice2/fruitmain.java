package StrategyPractice2;

public class fruitmain {
    public static void main(String[] args) {
        fruit f= new fruit(new twentypercent());
        f.sell();
    }
}
