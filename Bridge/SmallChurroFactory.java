package Bridge;

public class SmallChurroFactory extends ChurroFactory{

    public SmallChurroFactory(ChurroMachine cm) {
        super(cm);
    }

    @Override
    public void prepareChurro() {
        System.out.println("Small Churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_______________________");
    }
}
