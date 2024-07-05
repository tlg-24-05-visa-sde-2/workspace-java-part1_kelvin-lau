class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        System.out.println(city1 == city2);
        System.out.println(city1.equals(city2));
        System.out.println();

        String city1New = city1.substring(0, 3);
        String city2New = city2.substring(0, 3);
        System.out.println(city1New == city2New);
        System.out.println(city1.equals(city2));
        System.out.println();

        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{3}\\d{4}";
        String plate1 = "637YOC";
        System.out.println(plate1.matches(pattern));
        String plate2 = "AAS1124";
        System.out.println(plate2.matches(pattern));
    }
}