import java.lang.Math;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    boolean isEven(int a) {
        return a % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive)
     * HINT: see a class called Math (in package java.lang), look for a helpful method here
     * NOTE: these methods are all static
     */

    int randomNum() {
        double result = (Math.random() * 10) + 1;



        return (int) Math.round(result); // explicit downcast from double to int
    }
}