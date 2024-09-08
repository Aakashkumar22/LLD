package ParkingLotDesign.Models;

import ParkingLotDesign.Enums.ParkingSpotType;
import ParkingLotDesign.Enums.ParkingStatus;
import StrategyPattern.Vechicle;

public class ParkingSpot extends BaseModel{

     private Vechicle vechicle;
     private ParkingStatus parkingStatus;
     private  Long floorId;
     private ParkingSpotType parkingSpotType;


     public void setVechicle(Vechicle vechicle) {
          this.vechicle = vechicle;
     }

     public ParkingStatus getParkingStatus() {
          return parkingStatus;
     }

     public void setParkingStatus(ParkingStatus parkingStatus) {
          this.parkingStatus = parkingStatus;
     }

     public Long getFloorId() {
          return floorId;
     }

     public void setFloorId(Long floorId) {
          this.floorId = floorId;
     }

     public void setParkingSpotType(ParkingSpotType parkingSpotType) {
          this.parkingSpotType = parkingSpotType;
     }

     public void parkVehicle(){

     }

     public void unParkVehicle(){

     }

     public ParkingSpotType getParkingSpotType() {
          return parkingSpotType;
     }

     public Vechicle getVechicle() {
          return vechicle;
     }


}
