package BuilderPatternPractice;

public class buildemain {
    public static void main(String[] args) {
        student s= student.getBuilder().setName("Hari")
                .setUniversity("Michigan")
                .setAddress("SRE")
                .setMarks(100)
                .build();
        System.out.println(s);




    }
}
