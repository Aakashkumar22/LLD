package ParkingLotDesign.Models;

import ParkingLotDesign.Enums.VehicleType;

public class Vehicle extends  BaseModel {
     private String PlateNo;
     private ParkingLotDesign.Enums.VehicleType VehicleType;

    public VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getPlateNo() {
        return PlateNo;
    }

    public void setPlateNo(String plateNo) {
        PlateNo = plateNo;
    }
}
