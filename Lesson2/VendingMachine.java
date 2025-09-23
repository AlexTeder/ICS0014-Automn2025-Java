package Lesson2;

import Lesson2.model.Product;

import java.util.List;

public class VendingMachine {

    private static int myNumber = 1;

    public static void main(String[] args) {
        System.out.println("Hello, Vending Machine!");

        var product1 = new Product("Coca-Cola", "Coca-Cola Company", 1.5, 500, "ml");

        System.out.println(product1.getName());
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
