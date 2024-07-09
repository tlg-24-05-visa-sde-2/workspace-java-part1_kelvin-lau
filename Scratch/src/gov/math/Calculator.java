package gov.math;

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /*
     * Returns the average of the supplied integers.
     */
    public static double average(int first, int... rest) { // first: 12, rest: 3, 8
        double sum = first;
        for (int value : rest) {
            sum += value;
        }

        return sum / (rest.length + 1);
    }

    /*
     * Returns a random integer between 'min' and 'max' inclusive
     */

    public static int randomNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive)
     * HINT: see a class called Math (in package java.lang), look for a helpful method here
     * NOTE: these methods are all static
     */

    public static int randomNum() {
        double result = (Math.random() * 10) + 1;
        // randomNum(1, 11) - delegate to "min-max" version of randomNum()


        return (int) Math.round(result); // explicit downcast from double to int
    }
}