package Inventory_Managemet_System_Zepto;

import java.util.List;

public class UserController {
    List<User> UserList;
    UserController(List<User>Userlist){
        this.UserList=Userlist;
    }
    void addUser(User user){
        UserList.add(user);
    }

    void removeUser(User user){
        UserList.remove(0);
    }

    User getuser(int id){
        for (User user :UserList){
            if(user.getUserID()==id){
                return user;
            }
        }
        return null;
    }

}
