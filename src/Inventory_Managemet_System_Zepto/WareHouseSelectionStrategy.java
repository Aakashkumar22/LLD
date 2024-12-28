package Inventory_Managemet_System_Zepto;

import java.util.List;

public interface WareHouseSelectionStrategy {
    Warehouse selectwareHouse(List<Warehouse>warehouseList);

}
