package Lesson6_Maps.sweets_example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> sweetByLetter = new HashMap<>();
        sweetByLetter.put("A", List.of("Apple Pie", "Almond Cookie"));
        sweetByLetter.put("C", List.of("Caramel", "Cheesecake", "Cotton Candy"));
        sweetByLetter.put("G", List.of("Gummy bear", "Gingerbread"));
        sweetByLetter.put("T", List.of("Tiramisu", "Toffee", "Truffles"));
        sweetByLetter.put("M", List.of("Marshmallow", "Mocha", "Macaroon", "Milkshake"));

        System.out.println(sweetByLetter);
        System.out.println(sweetByLetter.get("C"));


        Map<Integer, String> textNumbersByInt = Map.of(
                1, "one",
                2, "two",
                3, "three",
                4, "four"
        );

        System.out.println(textNumbersByInt);
    }
}
