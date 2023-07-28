package Facade;

class Main{
    public static void main (String[] args){
        ChurrosFactory churrosFactory = new ChurrosFactory();

        System.out.println("\n---Churros Factory---");
        churrosFactory.openDoors();
        churrosFactory.cleanChurrosMachine();
        churrosFactory.startChurrosMachine();

        System.out.println("--------------------------");

        churrosFactory.cleanChurrosMachine();
        churrosFactory.shutdownChurrosMachine();
        churrosFactory.closeDoors();

        //FACADE
        ChurrosFactoryFacade churrosFactoryFacade = new ChurrosFactoryFacade(churrosFactory);
        System.out.println("\n---Churros Factory Facade---");
        churrosFactoryFacade.startFactory();
        System.out.println("--------------------------");
        churrosFactoryFacade.closeFactory();
    }
}