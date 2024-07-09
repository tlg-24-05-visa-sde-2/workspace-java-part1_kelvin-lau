import java.util.HashMap;
import java.util.Map;

class CalculatorClient {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 1000; i++) {
            int randNum = Calculator.randomNum(1, 20);
            if (map.containsKey(randNum)) {
                map.put(randNum, map.get(randNum) + 1);
            } else {
                map.put(randNum, 1);
            }
        }

       for (int num: map.keySet()) {
           System.out.println(num + " was returned " + map.get(num) + " times");
       }
    }
}