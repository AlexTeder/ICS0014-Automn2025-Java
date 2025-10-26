package Lesson3_Vending_Machine.VendingMachine.model.drink;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SoftDrink extends Drink {

    public SoftDrink(String name, String brand, double price, int size) {
        super(name, brand, price, size);
    }
}
