package Lesson3.VendingMachine;

import Lesson3.VendingMachine.model.Product;
import Lesson3.VendingMachine.model.drink.SoftDrink;
import Lesson3.VendingMachine.model.snack.Chocolate;

import java.util.List;

public class VendingMachine {

    private static int myNumber = 1;

    public static void main(String[] args) {
        System.out.println("Hello, Vending Machine!");

        var product1 = Chocolate.builder()
                .name("Choco-Bubbles")
                .brand("Milka")
                .price(3)
                .size(100)
                .sizeUnit("g")
                .build();

        var p = new Chocolate();

        System.out.println(product1.toString());

        System.out.println(myNumber);
        changeMyNumberOnCondition(-5);
        System.out.println(myNumber);

    }

    private static int countTotalProductSizes(List<Product> products) {
        int totalSize = 0;
        for (Product product : products) {
            totalSize += product.getSize();
        }
        return totalSize;
    }

    private static void changeMyNumberOnCondition(int checkInt) {
        if (checkInt > 5) myNumber= 5;
        else if (checkInt < 0) myNumber = 10;
        else myNumber = 0;
    }
}
