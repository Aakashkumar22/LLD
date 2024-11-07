package prototypePractice;

public class fruitmain {
    public static void main(String[] args) {
        fruit f= new fruit("Apple",100.00,"Red",67.00);
        fruit f2=(fruit)f.clone();
        System.out.println(f2);

    }
}
