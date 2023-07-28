package Facade;

public class ChurrosFactoryFacade {
    ChurrosFactory churrosFactory;

    ChurrosFactoryFacade(ChurrosFactory cf){
        churrosFactory = cf;
    }

    void startFactory(){
        churrosFactory.openDoors();
        churrosFactory.cleanChurrosMachine();
        churrosFactory.startChurrosMachine();
    }

    void closeFactory(){
        churrosFactory.cleanChurrosMachine();
        churrosFactory.shutdownChurrosMachine();
        churrosFactory.closeDoors();
    }
}
