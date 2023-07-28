package Bridge;

public abstract class ChurroFactory {
    protected ChurroMachine churroMachine;

    public ChurroFactory(ChurroMachine cm){
        churroMachine = cm;
    }

    public abstract void prepareChurro();
}
