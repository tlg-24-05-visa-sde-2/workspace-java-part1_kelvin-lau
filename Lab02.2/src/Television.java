class Television {
    String brand;
    int volume = 1;

    public void turnOn() {
        System.out.println(this.brand + " TV is on at volume - " + this.volume);
    }

    public void turnOff() {
        System.out.println(this.brand + " TV is off");
    }

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