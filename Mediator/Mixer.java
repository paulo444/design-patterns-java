package Mediator;

public class Mixer implements Colleague {
    private MachineMediator machineMediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        machineMediator = mediator;
    }
    
    public void mixIngredients(int velocity){
        System.out.println("Mixing at " + velocity);
        machineMediator.turnOff();
    }
}
