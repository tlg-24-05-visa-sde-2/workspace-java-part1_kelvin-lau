import java.util.HashMap;
import java.util.Map;

class CalculatorTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 5000; i++) {
            int randNum = Calculator.randomNum(0, 10);
            if (map.containsKey(randNum)) {
                map.put(randNum, map.get(randNum) + 1);
            } else {
                map.put(randNum, 1);
            }
        }

        System.out.println(map);
    }
}