package Lesson3.VendingMachine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public abstract class Product {
    private String name;
    private String brand;
    private double price;
    private int size;
    private String sizeUnit;

    @Override
    public String toString() {
        return String.format(
                "Product{name='%s', brand='%s', price=%s, size=%s, sizeUnit='%s'}",
                this.getClass().getSimpleName(), name, brand, price, size, sizeUnit);
    }
}


