package Mediator;

public class ChurrosMachineMediator implements MachineMediator {

    private Heater heater;
    private WaterDispenser waterDispenser;
    private Mixer mixer;

    ChurrosMachineMediator(Heater h, WaterDispenser w,
                            Mixer m){
        heater = h;
        waterDispenser = w;
        mixer = m;
    }

    @Override
    public void startMachine(){
        System.out.println("Regular Churros Process Started");
        startHeating();
    }

    @Override
    public void startHeating() {
        heater.heatChurros(30);
    }

    @Override
    public void fillWithWater() {
        waterDispenser.fillWithWater(150);
    }

    @Override
    public void mixIngredients() {
        mixer.mixIngredients(300);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }
}
