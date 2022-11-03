package Week8;

public class Main {
    public static void main(String[] args) {
        Notification n1=new EmailNotification();
        Notification n2=new FacebookNotification(n1);
        Notification n3=new WhatsappNotification(n2);
        Notification n4=new SMSNotification(n3);
        n4.SendNotify("Hello");
    }
}
