package ParkingLotDesign.Models;

import java.util.List;

public class ParkingLot {
     private String name;

    private List<Gates>gates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public List<Gates> getGates() {
        return gates;
    }

    public void setGates(List<Gates> gates) {
        this.gates = gates;
    }


}
