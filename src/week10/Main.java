package week10;

public class Main {

    public static void main(String[] args) {
        WhetherStation x=new WhetherStation();
        Observer a=new Mobile(x);
        Observer b=new Display(x);
        x.setData("data 1");
        System.out.println("_____________________________________");
        x.setData("data 2");
        System.out.println("_____________________________________");
        x.unregisterObserver(a);
        x.setData("data 3");
        System.out.println("_____________________________________");
        x.setData("data 4");
        System.out.println("_____________________________________");
    }
}
