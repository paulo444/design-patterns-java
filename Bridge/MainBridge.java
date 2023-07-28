package Bridge;

class MainBridge{
    public static void main(String[] args){
        //Create Machines
        ChurroMachineChocolate cmChocolate = new ChurroMachineChocolate();
        ChurroMachineStrawberry cmStrawberry = new ChurroMachineStrawberry();

        //Create Factories
        SmallChurroFactory smChurroFactory = new SmallChurroFactory(cmChocolate);
        MediumChurroFactory mdChurroFactory = new MediumChurroFactory(cmStrawberry);
        LargeChurroFactory lgChurroFactory = new LargeChurroFactory(cmChocolate);

        //Start Factories
        smChurroFactory.prepareChurro();
        mdChurroFactory.prepareChurro();
        lgChurroFactory.prepareChurro();
    }
}