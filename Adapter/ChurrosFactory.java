package Adapter;

public class ChurrosFactory {
    void prepareChurro(Food food){
        System.out.println("Starting process");
        System.out.print("Mixing ");
        for(int i=0; i<food.getIngredients().length; i++){
            System.out.print(food.getIngredients()[i] + " ");
        }
        System.out.println("\n" + food.getFood() + " prepared");
        System.out.println("----------------------------------");
    }
}