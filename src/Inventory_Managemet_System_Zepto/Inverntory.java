package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inverntory {
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private List<ProductCategory>productsList;

    public List<ProductCategory> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<ProductCategory> productsList) {
        this.productsList = productsList;
    }

    Inverntory(){
        productsList=new ArrayList<>();
    }

    void  addProduct(int categoryId,String name,Double price){
        ProductCategory p= new ProductCategory();
        p.setCategoryId(categoryId);
        p.setCategoryName(name);
        p.setPrice(price);
        productsList.add(p);

    }


}
