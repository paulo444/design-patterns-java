package ChainOfResponsibility;

public interface FactoryHandler {
    void setFactoryHandler(FactoryHandler handler);
    void process(Ingredient ingredient);
}
