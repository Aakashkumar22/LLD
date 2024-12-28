package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {
    List<Order>totalorderList;
    Map<Integer,List<Order>>UservsTotalOrder;

    OrderController(){
        totalorderList=new ArrayList<>();
        UservsTotalOrder=new HashMap<>();
    }

    public Order addOrders(User user,Warehouse warehouse){
        Order o=new Order(user,warehouse);
        totalorderList.add(o);
        List<Order>useroder=totalorderList;
        if(UservsTotalOrder.containsKey(user.getUserID())){
            UservsTotalOrder.put(user.getUserID(), useroder);
        }
        else{
            UservsTotalOrder.put(user.getUserID(), totalorderList);
        }
        return o;
    }

}
