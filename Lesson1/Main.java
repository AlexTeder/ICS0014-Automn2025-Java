package Lesson1;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(1, "Siamese", "Cream", "Blue");
        String catInfo = myCat.getCatState();
        System.out.println("Cat Info:\n" + catInfo);
    }
}
