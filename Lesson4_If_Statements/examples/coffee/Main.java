package Lesson4_If_Statements.examples.coffee;

public class Main {

    public static void main(String[] args) {

        magicalNumberExample(0);
        coffeeOrderExample();
        coffeeSwitchOrderExample(CoffeeType.ESPRESSO, "morning");
        coffeeSwitchOrderExample(CoffeeType.ESPRESSO, "afternoon");
        coffeeSwitchOrderExample(CoffeeType.CAPPUCCINO, "afternoon");

    }

    private static void coffeeSwitchOrderExample(CoffeeType myCoffee, String dayTime) {

        System.out.println("\nReady to prepare coffee for you!");
        switch (myCoffee) {
            case ESPRESSO -> {
                System.out.println("Wow!, so strong drink to go!");
                switch (dayTime) {
                    case "morning" -> System.out.println("Good morning! Would you like to add some sugar?");
                    default -> System.out.println("Are you sure you would like such energy boost soo late?");
                }
            }
            case CAPPUCCINO -> System.out.println("Great choice! With milk and foam, very tasty!");
            case LATTE -> System.out.println("Great choice! With lots of milk, very tasty!");
            default -> System.out.println("Interesting choice, hope you will like it!");
        }
        System.out.println("Coffee is ready, enjoy!");
    }

    private static void magicalNumberExample(int num) {
        if (num < 0) {
            System.out.println("Number is negative");
            if (num < -5) {
                System.out.println("Very negative number!");
        } else {
                System.out.println("Number is between -5 and 1");
        }
        }  if (num == 0) {
            System.out.println("Number is zero");
        }  if (num > 0) {
            System.out.println("Number is positive");
        }  if (num %2 ==0) {
            System.out.println("Number is even");
        }  if (num %2 !=0) {
            System.out.println("Number is odd");
        }
    }

        private static void coffeeOrderExample() {

        var myCoffee = CoffeeType.ESPRESSO;
        var dayTime = "morning";

        // 1. simple if-statement
        System.out.println(" 1. simple if-statement");
        System.out.println("Ready to prepare coffee for you!");
        if (myCoffee == CoffeeType.ESPRESSO) {
            System.out.println("Wow!, so strong drink to go!");
        }
        System.out.println("Great choice!");
        System.out.println("Coffee is ready, enjoy!");


        // 2. if-else statement
        System.out.println("\n 2. if-else statement");
        System.out.println("Ready to prepare coffee for you!");
        if (myCoffee == CoffeeType.ESPRESSO) {
            System.out.println("Wow!, so strong drink to go!");
        } else {
            System.out.println("Great choice!");
        }
        System.out.println("Coffee is ready, enjoy!");

        // 3. if-nested statement
        System.out.println("\n 3. if-nested statement");
        System.out.println("Ready to prepare coffee for you!");
        if (myCoffee == CoffeeType.ESPRESSO) {
            System.out.println("Wow!, so strong drink to go!");
            if ("morning".equals(dayTime)) {
                System.out.println("Good morning! Would you like to add some sugar?");
            } else {
                System.out.println("Are you sure you would like such energy boost soo late?");
            }
        } else {
            System.out.println("Great choice!");
        }
        System.out.println("Coffee is ready, enjoy!");

        // 4. if-else-if statement
        System.out.println("\n 4. if-else-if statement");
        System.out.println("Ready to prepare coffee for you!");
        if (myCoffee == CoffeeType.ESPRESSO) {
            System.out.println("Wow!, so strong drink to go!");
        } else if (myCoffee == CoffeeType.CAPPUCCINO) {
            System.out.println("Great choice! With milk and foam, very tasty!");
        } else if (myCoffee == CoffeeType.LATTE) {
            System.out.println("Great choice! With lots of milk, very tasty!");
        } else {
            System.out.println("Interesting choice, hope you will like it!");
        }
        System.out.println("Coffee is ready, enjoy!");
    }
}
