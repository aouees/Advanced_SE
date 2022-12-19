package Week13;

public class client implements observer {
    String name;
    String type;
    public client(String n,String s)
    {
        name=n;type=s;
    }
    @Override
    public void showmsg(String msg) {
        System.out.println(name+" : "+msg);
    }

    @Override
    public String getSMSCompany() {
        return type;
    }
}
