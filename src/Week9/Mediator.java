package Week9;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    List<User> users =new ArrayList<>();
    abstract void AddUserToGroup(User u);
    abstract void sendMSG(String msg,User u);
}
class MediatorImp extends Mediator{

    @Override
    void AddUserToGroup(User u) {
        users.add(u);
        sendMSG("added to group by Mediator",u);
    }

    @Override
    void sendMSG(String msg, User u) {
        for (User us:users) {
            if(us!=u)
            {
                us.receiveMSG(u.name+" : "+msg);
            }
        }
    }
}
