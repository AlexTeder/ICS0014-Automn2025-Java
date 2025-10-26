package Lesson5_Collections.bakeryexamples;

import java.util.List;

public class CinnamonBonProvider implements PastryProvider {

    private final List<String> ingredients = List.of(
            "Cinnamon",
            "Cinnamon",
            "Cinnamon",
            "Sugar",
            "Butter",
            "Butter",
            "Flour"
            );

    @Override
    public void bake() {
        System.out.println("Starting to bake Cinnabon!");
        int cinnamonQuantity = 0;
        int milkQuantity = 0;
        int sugarQuantity = 0;
        int butterQuantity = 0;

        for (String ingredient : ingredients) {
            if ("cinnamon".equalsIgnoreCase(ingredient)) {
                cinnamonQuantity++;
            } else if ("milk".equalsIgnoreCase(ingredient)) {
                milkQuantity++;
            } else if ("sugar".equalsIgnoreCase(ingredient)) {
                sugarQuantity++;
            } else if ("butter".equalsIgnoreCase(ingredient)) {
                butterQuantity++;
            }
        }
        System.out.println(String.format("Baking cinnabon out of: cinnamon x%d, milk x%d, sugar x%d, butter x%d",
                cinnamonQuantity, milkQuantity, sugarQuantity, butterQuantity));
        System.out.println("Cinnabon is baked!");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating cinnabon with adding icing to the cinnamon buns...");
    }

    private void ingredientsSwitch(String ingredient) {
        switch (ingredient.toLowerCase()) {
            case "cinnamon": // cinnamonQuantity++;
            case "milk": // milkQuantity++;
            case "sugar": // sugarQuantity++;
            case "butter": // butterQuantity++;
            default:
                System.out.println("Unknown ingredient: " + ingredient);
        }
    }
}
