package Mediator;

public class SoftChurrosMachineMediator implements MachineMediator {

    private Heater heater;
    private WaterDispenser waterDispenser;
    private Mixer mixer;

    SoftChurrosMachineMediator(Heater h, WaterDispenser w,
                            Mixer m){
        heater = h;
        waterDispenser = w;
        mixer = m;
    }

    @Override
    public void startMachine(){
        System.out.println("Soft Churros Process Started");
        startHeating();
    }

    @Override
    public void startHeating() {
        heater.heatChurros(20);
    }

    @Override
    public void fillWithWater() {
        waterDispenser.fillWithWater(300);
    }

    @Override
    public void mixIngredients() {
        mixer.mixIngredients(150);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }
    
}
