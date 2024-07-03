class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // FIELDS or INSTANCE VARIABLES
    private String brand;
    private int volume = 1;
    private DisplayType displayType = DisplayType.LED;

    private int oldVolume;
    private boolean isMuted = false;

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        this.setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        this.setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType displayType) {
        this(brand, volume);
        this.setDisplayType(displayType);
    }

    // BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println(this.getBrand() + " TV turning on. TV is at volume - " + this.getVolume());
    }

    public void turnOff() {
        System.out.println(this.getBrand() + " TV is off");
    }

    public void mute() {
        if (this.isMuted()) {
            this.setVolume(this.oldVolume);
            System.out.println("TV un-muted, volume is now " + this.getVolume());
            this.isMuted = false;
        } else {
            this.oldVolume = this.getVolume();
            this.setVolume(0);
            System.out.println("TV muted, volume is now " + this.getVolume());
            this.isMuted = true;
        }
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // ACCESSOR METHODS
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand);
                break;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("Invalid volume: " + volume + " - Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        } else {
            this.volume = volume;
        }
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public String toString() {
        String volumeString = isMuted ? "<muted>" : String.valueOf(getVolume());
        return "Television Brand: " + this.getBrand() + " - Display Type: " + this.getDisplayType() + " - Volume: " + volumeString;
    }
}