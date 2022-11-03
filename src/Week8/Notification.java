package Week8;

public interface Notification {
    void SendNotify(String msg);
}
class EmailNotification implements Notification{

    @Override
    public void SendNotify(String msg) {
        System.out.println("Email Notification : "+msg);
    }
}
