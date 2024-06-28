class Television {
    // FIELDS or INSTANCE VARIABLES
    String brand;
    int volume = 1;

    // BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println(this.brand + " TV turning on. TV is at volume - " + this.volume);
    }

    public void turnOff() {
        System.out.println(this.brand + " TV is off");
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
        return "Brand: " + this.brand + " - Volume: " + this.volume;
    }
}