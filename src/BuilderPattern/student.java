package BuilderPattern;

public class student {
    String name;
    Integer age;
    Double marks;
    String address;

    private student( Helper helper){


        this.name= helper.name;
        this.marks= helper.marks;
        this.age= helper.age;
        this.address= helper.address;



    }

    public  static Helper helper(){
        return new Helper();
    }
    public  static  class Helper {
        private String name;
        private Integer age;
        private Double marks;
        private String address;





        public String getName() {
            return name;
        }

        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public Helper setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Double getMarks() {
            return marks;
        }

        public Helper setMarks(Double marks) {
            this.marks = marks;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Helper setAddress(String address) {
            this.address = address;
            return this;
        }

        public  student build(){
            if(this.getMarks()<50){
                throw  new RuntimeException(" Marks are not upto the maks");
            }
            if(this.getAge()<18){
                throw  new RuntimeException(" Age ristricted you not adult");
            }


            return new student(this);
        }
    }

}
