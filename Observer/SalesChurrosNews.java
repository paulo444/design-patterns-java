package Observer;

import java.util.ArrayList;
import java.util.List;

public class SalesChurrosNews implements Subject {

    List<ObserverInt> salesEmployees = new ArrayList<ObserverInt>();

    @Override
    public void subscribeObserver(ObserverInt o) {
        salesEmployees.add(o);
    }

    @Override
    public void unsubscribeObserver(ObserverInt o) {
        salesEmployees.remove(o);
    }

    @Override
    public void notifyObservers(String notify) {
        for(ObserverInt employee : salesEmployees){
            employee.update(notify);
        }
    }
}
