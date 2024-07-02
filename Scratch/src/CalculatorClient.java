import java.util.HashMap;
import java.util.Map;

class CalculatorClient {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 4;

        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num2, num1);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num2 + " - " + num1 + " = " + difference);

        if (Calculator.isEven(num2)) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }
    }
}