package Week13;

public class mtnadapter implements SMSCompany  {
    MTN m=new MTN();

    @Override
    public String Send(String msg) {
        return m.getMSGFormat(msg);
    }
}
