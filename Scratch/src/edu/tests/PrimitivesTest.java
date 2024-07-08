package edu.tests;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 57;
        System.out.println("Age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("Population is: " + population);

        double salary = 1_000_000_000.0;
        System.out.println("Salary is: " + salary);

        boolean isCloudy = true;
        System.out.println("Is Cloudy is: " + isCloudy);

        char size = 'S';
        System.out.println("Size is: " + size);

        String grade = "A";
        System.out.println("Grade is: " + grade);

        String quote = "He said, \"Hello World\"";
        System.out.println(quote);

        int n = 18;
        int m = n;

        n = 19;

        System.out.println("n is: " + n); // should say 19
        System.out.println("m is: " + m); // still 18

        // Primitive types are not referenced
        String s = "a";
        String t = s;
        s = s + "b";
        System.out.println("s is: " + s);
        System.out.println("t is: " + t);
    }
}