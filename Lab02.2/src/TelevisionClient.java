class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrand("Samsung");

        Television tv2 = new Television();
        tv2.setBrand("LG");
        tv2.setVolume(6);

        Television tv3 = new Television();
        tv3.setBrand("Sony");
        tv3.setVolume(15);

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