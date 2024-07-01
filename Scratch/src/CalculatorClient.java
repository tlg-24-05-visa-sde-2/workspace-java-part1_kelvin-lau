import java.util.HashMap;
import java.util.Map;

class CalculatorClient {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int num1 = 1;
        int num2 = 4;

        int sum = c.add(num1, num2);
        int difference = c.subtract(num2, num1);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num2 + " - " + num1 + " = " + difference);

        if (c.isEven(num2)) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }

        System.out.println();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 50; i++) {
            int randNum = c.randomNum(0, 10);
            if (map.containsKey(randNum)) {
                map.put(randNum, map.get(randNum) + 1);
            } else {
                map.put(randNum, 1);
            }
        }

        System.out.println(map);
    }
}