package Proxy;

import java.util.List;

public class ProxyChurrosFactory implements Factory {
    private Factory realFactory;

    public ProxyChurrosFactory(){
        System.out.println("Creating Proxy Factory");
    }

    @Override
    public List<String> initializeFactory() {
        if(realFactory == null){
            realFactory = new RealChurrosFactory();
        }
        return realFactory.initializeFactory();
    }
}
