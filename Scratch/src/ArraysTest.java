import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 57;
        ages[1] = 51;
        ages[2] = 10;
        ages[3] = 10;
        System.out.println(Arrays.toString(ages));
        System.out.println();

        double[] temps = new double[4];
        temps[0] = 88.0;
        temps[1] = 77.3;
        temps[2] = 69.1;
        temps[3] = 101.5;
        System.out.println(Arrays.toString(temps));
        System.out.println();

        for (double temp : temps) {
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();

        String[] cities = {"San Francisco", "Atlanta", "Austin"};
        System.out.println(Arrays.toString(cities));
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Index: " + i + " - City: " + cities[i]);
        }
    }
}