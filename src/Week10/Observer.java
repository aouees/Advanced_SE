package Week10;

public interface Observer {
    void update(Subject s);
}

class Mobile implements Observer {

    Subject x;

    public Mobile(Subject x) {
        this.x = x;
        this.x.registerObserver(this);
    }

    @Override
    public void update(Subject s) {
        if (s == x)
            System.out.println("Mobile : ((WhetherStation)x).getData() = " + ((WhetherStation) x).getData());
    }
}

class Display implements Observer {

    Subject x;

    public Display(Subject x) {
        this.x = x;
        this.x.registerObserver(this);
    }

    @Override
    public void update(Subject s) {
        if (s == x)
            System.out.println("Display : ((WhetherStation)x).getData() = " + ((WhetherStation) x).getData());
    }
}
