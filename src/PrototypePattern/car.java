package PrototypePattern;

public class car implements Prototype {
    String name;
    String company;
    String Model_year;
    private Integer id;
    Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    String color;



    car(String name,String company,String Model_year,Integer id ){
        this.name=name;
        this.company=company;
        this.Model_year=Model_year;
        this.id=id;

    }


    @Override
    public Prototype makeclone() {
        return new car(name,company,Model_year,id);
    }
}
