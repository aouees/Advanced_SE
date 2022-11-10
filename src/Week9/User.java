package Week9;

public abstract class User {
    Mediator mediator;
    String name;
    public  User(Mediator m,String n)
    {
        mediator=m;
        name=n;
    }
    abstract void sendMSG(String msg);
    abstract void receiveMSG(String msg);
}

class  UserImp extends User{

    public UserImp(Mediator m, String n) {
        super(m, n);
        mediator.AddUserToGroup(this);
    }

    @Override
    void sendMSG(String msg) {
        mediator.sendMSG(msg,this);
    }

    @Override
    void receiveMSG(String msg) {
        System.out.println("[ "+name+" Screen ] : "+msg);

    }
}
