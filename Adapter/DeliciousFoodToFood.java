package Adapter;

public class DeliciousFoodToFood implements Food {
    public static DeliciousFood deliciousFood;

    DeliciousFoodToFood(DeliciousFood df){
        deliciousFood = df;
    }

    @Override
    public String getFood() {
        return deliciousFood.getChurrito();
    }

    @Override
    public String[] getIngredients() {
        return deliciousFood.getChurroIngredients();
    }
    
}
