class Television {
    String brand;
    int volume = 1;

    void turnOn() {
        System.out.println(brand + " TV is on at volume - " + volume);
    }

    void turnOff() {
        System.out.println(brand + " TV is off");
    }
}