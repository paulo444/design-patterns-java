package Proxy;

public class MainProxy{
    public static void main(String[] args){
        ChurrosCompany churrosCompany = new ChurrosCompany();

        //Get and Sell Churros
        System.out.println("Selling Churros");
        System.out.println(churrosCompany.getChurrosQuantity());
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        System.out.println(churrosCompany.getChurrosQuantity());
        System.out.println("-----------------------------------");

        //Prepare Churros
        System.out.println("Preparing Churros");
        churrosCompany.startChurrosFactory();
    }
}