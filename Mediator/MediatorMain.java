package Mediator;

public class MediatorMain{
    public static void main(String[] args){
        //Create Colleagues
        Heater heater = new Heater();
        WaterDispenser waterDispenser = new WaterDispenser();
        Mixer mixer = new Mixer();

        //Create Regular Mediator
        //ChurrosMachineMediator regularMachine = new ChurrosMachineMediator(heater, waterDispenser, mixer);

        //Create Soft Mediator
        SoftChurrosMachineMediator regularMachine = new SoftChurrosMachineMediator(heater, waterDispenser, mixer);

        heater.setMediator(regularMachine);
        waterDispenser.setMediator(regularMachine);
        mixer.setMediator(regularMachine);

        //Start Preparing Regular Churros
        regularMachine.startMachine();
    }
}