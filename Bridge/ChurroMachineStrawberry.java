package Bridge;

public class ChurroMachineStrawberry implements ChurroMachine {

    @Override
    public void startChurroMachine() {
        System.out.println("Starting Machine");
    }

    @Override
    public String getChurro() {
        return "Strawberry Churro";
    }
}
