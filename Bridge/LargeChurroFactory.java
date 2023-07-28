package Bridge;

public class LargeChurroFactory extends ChurroFactory{

    public LargeChurroFactory(ChurroMachine cm) {
        super(cm);
    }

    @Override
    public void prepareChurro() {
        System.out.println("Large Churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_______________________");
    }
}

