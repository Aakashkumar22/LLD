package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    private  int categoryId;
    private String CategoryName;
    private List<Prodcut>ProductsList=new ArrayList<>();
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public List<Prodcut> getProductsList() {
        return ProductsList;
    }

    public void setProductsList(List<Prodcut> productsList) {
        ProductsList = productsList;
    }

    public void add(Prodcut prodcut){
        ProductsList.add(prodcut);
    }

    void remove(int count){
        for(int i=0;i<=count;i++){
            ProductsList.remove(0);
        }
    }
}
