package Lesson3_Vending_Machine.examples;

public class Bicycle extends Vehicle {

    @Override
    public void honk() {
        System.out.println("Ding! Ding!");
    }

    @Override
    public void honk(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Ding!");
        }
    }
}
