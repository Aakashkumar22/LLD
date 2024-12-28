package Inventory_Managemet_System_Zepto;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private int id;
    Map<Integer,Integer>ItemCounts;
    Cart(){
        ItemCounts=new HashMap<>();
    }
    void addItemsInCart(int productid,int count){
        if(ItemCounts.containsKey(productid)){
            int noifitems=ItemCounts.get(productid);
            ItemCounts.put(productid,count+noifitems);
        }
        else{
            ItemCounts.put(productid,count);
        }
    }

    void RemoveIromcart(int productCategoryId,int count){
        if(ItemCounts.containsKey(productCategoryId)){
            int remaining=ItemCounts.get(productCategoryId);
            if(count-remaining==0){
                ItemCounts.remove(productCategoryId);
            }
            else{
                ItemCounts.put(productCategoryId,count-remaining);
            }
        }

    }

    void emptycart(){
        ItemCounts=new HashMap<>();
    }

    Map<Integer,Integer> getcart(){
        return  ItemCounts;
    }



}
