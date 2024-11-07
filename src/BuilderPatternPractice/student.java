package BuilderPatternPractice;

public  class student {
    Integer marks;
    String name;
    String University;
    double psp;
    String address;

     public static builder getBuilder(){
        return  new builder();
    }

    private student(builder builder){

        this.marks= builder.marks;
        this.address= builder.address;;
        this.name= builder.name;
        this.psp= builder.psp;
        this.University= builder.University;
    }
    public static class builder {
        Integer marks;
        String name;
        String University;
        double psp;
        String address;

        public String getName() {
            return name;
        }

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getMarks() {
            return marks;
        }

        public  builder setMarks(int marks) {
            this.marks = marks;
            return this;
        }

        public String getUniversity() {
            return University;
        }

        public builder setUniversity(String university) {
            University = university;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public  builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public  builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public student build(){

            if(this.marks<100){
                System.out.println(" The marks are less");
            }

            return new student(this);
        }
    }


}
