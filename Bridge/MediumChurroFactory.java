package Bridge;

public class MediumChurroFactory extends ChurroFactory{

    public MediumChurroFactory(ChurroMachine cm) {
        super(cm);
    }

    @Override
    public void prepareChurro() {
        System.out.println("Medium Churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_______________________");
    }
}
