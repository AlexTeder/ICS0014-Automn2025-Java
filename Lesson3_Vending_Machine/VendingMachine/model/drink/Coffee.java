package Lesson3_Vending_Machine.VendingMachine.model.drink;


import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Coffee extends Drink {

    public Coffee(String name, String brand, double price, int size) {
        super(name, brand, price, size);
    }
}
