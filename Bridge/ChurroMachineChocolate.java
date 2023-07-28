package Bridge;

public class ChurroMachineChocolate implements ChurroMachine {

    @Override
    public void startChurroMachine() {
        System.out.println("Starting Machine");
    }

    @Override
    public String getChurro() {
        return "Chocolate Churro";
    }
}
