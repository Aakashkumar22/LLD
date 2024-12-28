package Inventory_Managemet_System_Zepto;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    private String userName;
    Cart userItems;
    Address address;
    List<Integer>orders;
    User(){
        userItems=new Cart();
        orders=new ArrayList<>();


    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Cart getItms(){
        return userItems;
    }


}
