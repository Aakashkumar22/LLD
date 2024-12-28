package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    private  int categoryId;
    private String CategoryName;
    private List<Prodcut>ProductsList=new ArrayList<>();


    public void add(Prodcut prodcut){
        ProductsList.add(prodcut);
    }

    void remove(int count){
        for(int i=0;i<=count;i++){
            ProductsList.remove(0);
        }
    }
}
