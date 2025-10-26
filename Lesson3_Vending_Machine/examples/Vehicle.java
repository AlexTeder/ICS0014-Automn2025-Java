package Lesson3_Vending_Machine.examples;

public abstract class Vehicle {

    public void honk(){
        System.out.println("Honk! Honk!");
    }

    public void honk(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Honk!");
        }
    }

    public void honk(String sound){
        System.out.println(sound);
    }
}
