package Week13;

public class syriateladapter implements SMSCompany{
    Syriatel s=new Syriatel();
    @Override
    public String Send(String msg) {
        return s.getMSGFormat(msg);
    }
}
