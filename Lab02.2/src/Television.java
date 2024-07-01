class Television {
    // FIELDS or INSTANCE VARIABLES
    private String brand;
    private int volume = 1;

    // BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println(this.getBrand() + " TV turning on. TV is at volume - " + this.getVolume());
    }

    public void turnOff() {
        System.out.println(this.getBrand() + " TV is off");
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // ACCESSOR METHODS
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Television Brand: " + this.getBrand() + " - Volume: " + this.getVolume();
    }
}