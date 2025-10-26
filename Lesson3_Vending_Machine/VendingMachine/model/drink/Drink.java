package Lesson3_Vending_Machine.VendingMachine.model.drink;

import Lesson3_Vending_Machine.VendingMachine.model.Product;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Drink extends Product {

    public Drink(String name, String brand, double price, int size) {
        super(name, brand, price, size, "ml");
    }
}
