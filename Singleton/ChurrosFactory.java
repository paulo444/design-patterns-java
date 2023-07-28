package Singleton;

public class ChurrosFactory {
    private static ChurrosFactory factory = null;
    private int churrosNumber;

    private ChurrosFactory(){}

    public static ChurrosFactory getFactory(){
        if(factory == null){
            factory = new ChurrosFactory();
        }
        return factory;
    }

    public void setChurrosNumber(int cn){
        churrosNumber = cn;
    }

    public int returnChurrosNumber(){
        return churrosNumber;
    }

    // private volatile static ChurrosFactory factory = null;

    // public static ChurrosFactory getFactoryThreads(){
    //     if(factory == null){
    //         synchronized(ChurrosFactory.class){
    //             if(factory == null){
    //                 factory = new ChurrosFactory();
    //             }
    //         }
    //     }
    //     return factory;
    // }
}
