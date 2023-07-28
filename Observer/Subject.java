package Observer;

public interface Subject {
    void subscribeObserver(ObserverInt o);
    void unsubscribeObserver(ObserverInt o);
    void notifyObservers(String notification);
}
