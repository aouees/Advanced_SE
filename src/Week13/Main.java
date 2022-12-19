package Week13;

public class Main {


    public static void main(String[] args) {
        store branch1=new Branch1();

        client c1=new client("aaa","sy");
        client c2=new client("b","mtn");
        client c3=new client("c","sy");
        client c4=new client("d","mtn");
        branch1.registerObserver(c1);
        branch1.registerObserver(c2);
        branch1.registerObserver(c3);
        branch1.registerObserver(c4);

        branch1.createOffer(new offer("sad","das"));
    }
}
