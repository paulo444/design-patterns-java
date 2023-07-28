package Observer;

import java.util.ArrayList;
import java.util.List;

public class ChurrosNews implements Subject {

    List<ObserverInt> allEmployees = new ArrayList<ObserverInt>();

    @Override
    public void subscribeObserver(ObserverInt o) {
        allEmployees.add(o);
    }

    @Override
    public void unsubscribeObserver(ObserverInt o) {
        allEmployees.remove(o);
    }

    @Override
    public void notifyObservers(String notify) {
        for(ObserverInt employee : allEmployees){
            employee.update(notify);
        }
    }
}
