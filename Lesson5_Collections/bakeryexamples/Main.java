package Lesson5_Collections.bakeryexamples;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String type = "pizza";

        PastryProvider pastryProvider = null;

        if ("pizza".equals(type)) {
            pastryProvider = new PizzaProvider();
        } else if ("cinnabon".equals(type)) {
            pastryProvider = new CinnamonBonProvider();
        } else {
            System.out.println("Unknown pastry type: " + type);
        }

        pastryProvider.bake();
        pastryProvider.decorate();

        int[] myInts = new int [5];
        // [0, 0, 0, 0, 0]

        List<Integer> myObjInts = List.of(1,2,3);
    }
}
