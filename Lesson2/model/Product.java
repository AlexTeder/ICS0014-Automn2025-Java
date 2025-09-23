package Lesson2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private String brand;
    private double price;
    private int size;
    private String sizeUnit;

    @Override
    public String toString() {
        return String.format("Product{name='%s', brand='%s', price=%.2f, size=%d%s, sizeUnit='%s'}",
                             name, brand, price, size, sizeUnit, sizeUnit);
    }
}


