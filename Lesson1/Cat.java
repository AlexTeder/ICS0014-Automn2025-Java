package Lesson1;

public class Cat {
    private int id;
    private String breed;
    private String color;
    private String eyeColor;

    public Cat(int id, String breed, String color, String eyeColor){
        this.id = id;
        this.breed = breed;
        this.color = color;
        this.eyeColor = eyeColor;
    }

    public String getCatState(){
        return String.format("Id: %s, \nBreed: %s, \nFur Color: %s, \nEye Color: %s", id,  breed, color, eyeColor);
    }
}
