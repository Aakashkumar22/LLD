package BuilderPattern;

public class clent {
    public static void main(String[] args) {
       student s=student.helper().setAge(21)
               .setAddress("Mumbai")
               .setMarks(66.89)
               .setName("Umang")
               .build();
        System.out.println(s);

    }
}
