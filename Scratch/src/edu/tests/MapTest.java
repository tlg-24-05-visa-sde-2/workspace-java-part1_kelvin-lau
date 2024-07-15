package edu.tests;

import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Kelvin", 1.8);
        grades.put("DeShon", 3.7);
        grades.put("Chris", 3.3);
        grades.put("Tyler", 1.9);

        dump(grades);
    }

    public static void dump(Map<String, Double> grades) {
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}