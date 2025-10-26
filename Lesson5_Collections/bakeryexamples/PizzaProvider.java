package Lesson5_Collections.bakeryexamples;

import java.util.List;

public class PizzaProvider implements PastryProvider {


    public final List<String> ingredients = List.of(
            "Dough",
            "Tomato Sauce",
            "Cheese",
            "Pepperoni",
            "Olives",
            "Mushrooms"
    );
    @Override
    public void bake() {
        System.out.println("Preparing Pizza with ingredients:");
        int doughQuantity = 0;
        int sauceQuantity = 0;
        int cheeseQuantity = 0;
        int pepperoniQuantity = 0;
        int olivesQuantity = 0;
        int mushroomsQuantity = 0;

        for (String ingredient : ingredients) {
            if ("dough".equalsIgnoreCase(ingredient)) {
                doughQuantity++;
            } else if ("tomato sauce".equalsIgnoreCase(ingredient)) {
                sauceQuantity++;
            } else if ("cheese".equalsIgnoreCase(ingredient)) {
                cheeseQuantity++;
            } else if ("pepperoni".equalsIgnoreCase(ingredient)) {
                pepperoniQuantity++;
            } else if ("olives".equalsIgnoreCase(ingredient)) {
                olivesQuantity++;
            } else if ("mushrooms".equalsIgnoreCase(ingredient)) {
                mushroomsQuantity++;
            }
        }
        System.out.println(String.format("Baking pizza out of: dough x%d, tomato sauce x%d, cheese x%d, pepperoni x%d, olives x%d, mushrooms x%d",
                doughQuantity, sauceQuantity, cheeseQuantity, pepperoniQuantity, olivesQuantity, mushroomsQuantity));
        System.out.println("Pizza is baked!");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating Pizza with more Sauce");
    }
}
