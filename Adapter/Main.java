package Adapter;

public class Main {
    public static void main(String[] args){
        Churro simpleChurro = new Churro();
        ChurroRelleno churroRelleno = new ChurroRelleno();

        ChurrosFactory churroFactory = new ChurrosFactory();
        churroFactory.prepareChurro(simpleChurro);
        //churroFactory.prepareChurro(churroRelleno);

        //ADAPTER
        DeliciousFoodToFood churroAdapter = new DeliciousFoodToFood(churroRelleno);
        churroFactory.prepareChurro(churroAdapter);
    }
}
