package ChainOfResponsibility;

public class Ingredient {
    private String name;

    Ingredient(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
