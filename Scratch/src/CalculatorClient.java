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

        System.out.println(c.randomNum());
    }
}