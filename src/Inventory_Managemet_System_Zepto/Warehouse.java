package Inventory_Managemet_System_Zepto;

import java.util.List;

public class Warehouse {
    private Inverntory inverntory;
    private Address address;
    public List<Inverntory>InventoryList;

    public Inverntory getInverntory() {
        return inverntory;
    }

    public void setInverntory(Inverntory inverntory) {
        this.inverntory = inverntory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addInventory(int InventoryId){
             Inverntory i=new Inverntory();
             i.setId(InventoryId);
             InventoryList.add(i);
        }
    }




