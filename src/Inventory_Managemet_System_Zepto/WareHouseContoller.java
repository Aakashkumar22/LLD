package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.List;

public class WareHouseContoller {
    List<Warehouse>wareHouseList;
    WareHouseSelectionStrategy wareHouseStrategy=null;
    WareHouseContoller(List<Warehouse>wareHouseList,WareHouseSelectionStrategy wss){
        this.wareHouseList=wareHouseList;
        this.wareHouseStrategy=wss;

    }

    void addwareHouse(Warehouse warehouse){
        wareHouseList.add(warehouse);
    }

    void remove(Warehouse warehouse){
        wareHouseList.remove(warehouse);
    }
    public Warehouse selectwareHouse(WareHouseSelectionStrategy wareHouseSelectionStrategy){
        this.wareHouseStrategy=wareHouseSelectionStrategy;
        return wareHouseSelectionStrategy.selectwareHouse(wareHouseList);
    }
}
