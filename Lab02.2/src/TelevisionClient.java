class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television("Samsung");

        Television tv2 = new Television("LG", 6);

        Television tv3 = new Television();

        tv1.turnOn();
        tv1.turnOff();

        System.out.println();

        tv2.turnOn();
        tv2.turnOff();

        System.out.println();

        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2); // toString method not necessary, it's automatically called
        System.out.println(tv3);
    }
}