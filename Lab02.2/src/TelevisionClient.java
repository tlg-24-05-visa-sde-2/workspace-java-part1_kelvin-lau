class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.brand = "Samsung";

        Television tv2 = new Television();
        tv2.brand = "LG";
        tv2.volume = 6;

        Television tv3 = new Television();
        tv3.brand = "Sony";
        tv3.volume = 15;

        tv1.turnOn();
        tv1.turnOff();

        System.out.println();

        tv2.turnOn();
        tv2.turnOff();

        System.out.println();

        tv3.turnOn();
        tv3.turnOff();
    }
}