package Mediator;

public class WaterDispenser implements Colleague {
    private MachineMediator machineMediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        machineMediator = mediator;
    }

    public void fillWithWater(float ml){
        System.out.println("Filling " + ml);
        machineMediator.mixIngredients();
    }
    
}
