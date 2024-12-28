package Inventory_Managemet_System_Zepto;

import java.util.List;

public class FarwareHouseStrategy implements  WareHouseSelectionStrategy{
    @Override
    public Warehouse selectwareHouse(List<Warehouse> warehouseList) {
        return warehouseList.get(warehouseList.size()-1);
    }
}
