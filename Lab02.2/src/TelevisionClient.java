class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount());
        Television tv1 = new Television("Samsung");

        Television tv2 = new Television("LG", Television.MIN_VOLUME);

        Television tv3 = new Television("Sony", 40, DisplayType.CRT);

        tv1.turnOn();
        tv1.setVolume(Television.MAX_VOLUME);
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

        System.out.println();

        tv3.setVolume(Television.MAX_VOLUME);

        tv3.mute();
        tv3.mute();
        tv3.mute();
        tv3.mute();

        System.out.println();

        System.out.println(Television.getInstanceCount());
    }
}