package Mediator;

public class Heater implements Colleague {
    private MachineMediator machineMediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        machineMediator = mediator;
    }

    public void heatChurros(int degrees){
        System.out.println("Heating up to " + degrees);
        machineMediator.fillWithWater();
    }
    
}
