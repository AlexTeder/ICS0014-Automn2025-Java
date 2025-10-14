package Lesson3.VendingMachine.model.drink;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SoftDrink extends Drink {

    public SoftDrink(String name, String brand, double price, int size) {
        super(name, brand, price, size);
    }
}
