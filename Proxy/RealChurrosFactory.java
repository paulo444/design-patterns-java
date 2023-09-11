package Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealChurrosFactory implements Factory {

    List<String> churrosMachine;

    @Override
    public List<String> initializeFactory() {
        churrosMachine = new ArrayList<String>();
        for(int i=0; i<5; i++){
            System.out.println("Machine " + i + " initialized");
            churrosMachine.add("Machine " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return churrosMachine;
    }
}
