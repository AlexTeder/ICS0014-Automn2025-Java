package Lesson3.VendingMachine.model.drink;

import Lesson3.VendingMachine.model.Product;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Drink extends Product {

    public Drink(String name, String brand, double price, int size) {
        super(name, brand, price, size, "ml");
    }
}
