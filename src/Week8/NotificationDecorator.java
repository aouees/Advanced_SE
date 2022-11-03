package Week8;

public class NotificationDecorator implements Notification{
    Notification n;
    @Override
    public void SendNotify(String msg) {
        n.SendNotify(msg);
    }
    NotificationDecorator(Notification n)
    {
        this.n=n;
    }
}

class FacebookNotification extends NotificationDecorator{

    FacebookNotification(Notification n) {
        super(n);
    }

    @Override
    public void SendNotify(String msg) {
        n.SendNotify(msg);
        System.out.println("FaceBook Notification : "+msg);
    }
}

class SMSNotification extends  NotificationDecorator{

    SMSNotification(Notification n) {
        super(n);
    }

    @Override
    public void SendNotify(String msg) {
        n.SendNotify(msg);
        System.out.println("SMS Notification : "+msg);
    }
}

class  WhatsappNotification extends  NotificationDecorator{

    WhatsappNotification(Notification n) {
        super(n);
    }

    @Override
    public void SendNotify(String msg) {
        n.SendNotify(msg);
        System.out.println("Whatsapp Notification : "+msg);
    }
}