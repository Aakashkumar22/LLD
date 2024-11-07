package BuilderPatternPractice;

public class student {
    Integer marks;
    String name;
    String University;
    double psp;
    String address;

    student(builder builder){
        if(builder.marks<90){
            System.out.println(" not in Topper");
        }
        this.marks= builder.marks;
        this.address= builder.address;;
        this.name= builder.name;
        this.psp= builder.psp;
        this.University= builder.University;
    }


}
