package Adapter;

public class Churro implements Food {
    String food = "Churro";
    String[] ingredients = {"Flour", "Water"};

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String[] getIngredients() {
        return ingredients;
    }
}
