package week10;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
     void registerObserver(Observer x);
     void unregisterObserver(Observer x);
     void notifyObserver();
}

class  WhetherStation implements Subject{
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObserver();
    }

    List<Observer> observers=new ArrayList<>();
    @Override
    public void registerObserver(Observer x) {
        observers.add(x);
    }

    @Override
    public void unregisterObserver(Observer x) {
    observers.remove(x);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(this);
        }
    }
}
