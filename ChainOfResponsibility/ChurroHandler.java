package ChainOfResponsibility;

public class ChurroHandler implements FactoryHandler{
    private FactoryHandler factoryHandler;

    @Override
    public void setFactoryHandler(FactoryHandler handler) {
        factoryHandler = handler;
    }

    @Override
    public void process(Ingredient ingredient) {
        if(ingredient.getName().equals("REGULAR_INGREDIENT")){
            System.out.println("Ingrediente procesado (ChurroHandler)");
            System.out.println("");
        }else if(factoryHandler != null){
            System.out.println("Pasala");
            factoryHandler.process(ingredient);
        }else{
            System.out.println("INGREDIENTE INVALIDO");
        }
    }
}
