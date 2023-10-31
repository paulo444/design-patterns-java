package ChainOfResponsibility;

public class HardChurroHandler implements FactoryHandler{
    private FactoryHandler factoryHandler;

    @Override
    public void setFactoryHandler(FactoryHandler handler) {
        factoryHandler = handler;
    }

    @Override
    public void process(Ingredient ingredient) {
        if(ingredient.getName().equals("HARD_INGREDIENT")){
            System.out.println("Ingrediente procesado (HardChurroHandler)");
            System.out.println("");
        }else if(factoryHandler != null){
            System.out.println("Pasala");
            factoryHandler.process(ingredient);
        }else{
            System.out.println("INGREDIENTE INVALIDO");
        }
    }
}
