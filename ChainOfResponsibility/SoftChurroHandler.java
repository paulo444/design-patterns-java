package ChainOfResponsibility;

public class SoftChurroHandler implements FactoryHandler {
    private FactoryHandler factoryHandler;

    @Override
    public void setFactoryHandler(FactoryHandler handler) {
        factoryHandler = handler;
    }

    @Override
    public void process(Ingredient ingredient) {
        if(ingredient.getName().equals("SOFT_INGREDIENT")){
            System.out.println("Ingrediente procesado (SoftChurroHandler)");
            System.out.println("");
        }else if(factoryHandler != null){
            System.out.println("Pasala");
            factoryHandler.process(ingredient);
        }else{
            System.out.println("INGREDIENTE INVALIDO");
        }
    }
}
