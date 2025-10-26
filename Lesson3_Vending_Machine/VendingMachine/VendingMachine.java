package Lesson3_Vending_Machine.VendingMachine;

import Lesson3_Vending_Machine.VendingMachine.model.Product;
import Lesson3_Vending_Machine.VendingMachine.model.drink.SoftDrink;
import Lesson3_Vending_Machine.VendingMachine.model.snack.Chocolate;
import Lesson3_Vending_Machine.VendingMachine.model.snack.Cookies;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private static int myNumber = 1;

    List<String> products = new ArrayList<>(
            List.of(
                    "a"
            )
    );

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(
                Cookies.builder()
                        .name("Choco chip")
                        .brand("Milka")
                        .price(2.50)
                        .size(200)
                        .sizeUnit("g")
                        .build()
        );

        products.add(
                new SoftDrink("Pepsi Max", "Pepsi", 0.80, 330)
        );

        System.out.println(products);




    }
//        System.out.println("Hello, Vending Machine!");
//
//        var product1 = Chocolate.builder()
//                .name("Choco-Bubbles")
//                .brand("Milka")
//                .price(3)
//                .size(100)
//                .sizeUnit("g")
//                .build();
//
//        var p = new Chocolate();
//
//        System.out.println(product1.toString());
//
//        System.out.println(myNumber);
//        changeMyNumberOnCondition(-5);
//        System.out.println(myNumber);
//
//    }
//
//    private static int countTotalProductSizes(List<Product> products) {
//        int totalSize = 0;
//        for (Product product : products) {
//            totalSize += product.getSize();
//        }
//        return totalSize;
//    }
//
//    private static void changeMyNumberOnCondition(int checkInt) {
//        if (checkInt > 5) myNumber= 5;
//        else if (checkInt < 0) myNumber = 10;
//        else myNumber = 0;
//    }
}
