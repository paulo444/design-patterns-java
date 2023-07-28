package Singleton;

class MainSingleton{
    public static void main(String[] args){
        ChurrosFactory factory1 = ChurrosFactory.getFactory();
        ChurrosFactory factory2 = ChurrosFactory.getFactory();

        factory1.setChurrosNumber(308);

        System.out.println(factory1.returnChurrosNumber());
        System.out.println(factory2.returnChurrosNumber());
        System.out.println(ChurrosFactory.getFactory().returnChurrosNumber());
    }
}