package Week13;


public interface subject {
    void registerObserver(observer x);
    void unregisterObserver(observer x);
    void notifyObserver(offer o);
}
