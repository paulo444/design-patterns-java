package ChainOfResponsibility;

class MainChain{
    public static void main(String[] args){
        FactoryHandler churroHandler = new ChurroHandler();
        FactoryHandler softChurroHandler = new SoftChurroHandler();
        FactoryHandler hardChurroHandler = new HardChurroHandler();
        
        churroHandler.setFactoryHandler(softChurroHandler);
        softChurroHandler.setFactoryHandler(hardChurroHandler);

        Ingredient ingredient = new Ingredient("REGULAR_INGREDIENT");
        churroHandler.process(ingredient);
        
        ingredient = new Ingredient("SOFT_INGREDIENT");
        churroHandler.process(ingredient);

        ingredient = new Ingredient("HARD_INGREDIENT");
        churroHandler.process(ingredient);

        ingredient = new Ingredient("SPICY_INGREDIENT");
        churroHandler.process(ingredient);
    }
}