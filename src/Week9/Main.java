package Week9;

public class Main {
    public static void main(String[] args) {
        Mediator mediator=new MediatorImp();
        User u=new UserImp(mediator,"lolo");
        User u1=new UserImp(mediator,"soso");
        User u2=new UserImp(mediator,"fofo");
        User u3=new UserImp(mediator,"roro");
        User u4=new UserImp(mediator,"koko");
        u.sendMSG("Hello evry one");
    }
}
