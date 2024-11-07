package BuilderPatternPractice;

public class buildemain {
    public static void main(String[] args) {
        builder b=new builder();
        b.marks=100;
        b.name="Abhi";
        b.address="sahara";
        b.psp=65.00;
        b.University="Allahbad";

        student s= new student(b);
        System.out.println(s.University);
    }
}
