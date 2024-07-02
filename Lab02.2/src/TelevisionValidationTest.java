class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv1 = new Television("Samsung");
        tv1.setVolume(0);
        System.out.println(tv1);

        tv1.setVolume(100);
        System.out.println(tv1);

        tv1.setVolume(-1);
        System.out.println(tv1);

        tv1.setVolume(101);
        System.out.println(tv1);

        System.out.println();

        Television tv2 = new Television();

        tv2.setBrand("Samsung");
        System.out.println(tv2);
        tv2.setBrand("LG");
        System.out.println(tv2);
        tv2.setBrand("Sony");
        System.out.println(tv2);
        tv2.setBrand("Toshiba");
        System.out.println(tv2);
        tv2.setBrand("INVALID");
        System.out.println(tv2);
    }
}