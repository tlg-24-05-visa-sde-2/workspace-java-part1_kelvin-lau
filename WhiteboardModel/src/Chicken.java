class Chicken {
    private String name = "Chicken";
    private String breed; // constraint: ["Silkie", "Sussex", "Leghorn", etc.]
    private String gender; // constraint: ["Male", "Female"]
    private int age; // constraint: Min of 0
    private int legs = 2; // constraint: Max of 2
    private int wings = 2; // constraint: Max of 2
    private double hungerLevel = 50.0; // constraint: Between 0 and 100
    private boolean isAlive = true;
    private boolean isHungry = false;

    public void speak() {
        System.out.println("Cluck! Cluck! Cluck!");
    }

    public void eat() {
        System.out.println(this.name + " is eating...");
        this.hungerLevel += 5;
    }

    public void loseWing() {
        this.wings--;
    }

    public void loseLeg() {
        System.out.println(this.name + " has lost a leg!");
        this.legs--;
    }

    public void die() {
        System.out.println(this.name + " has died...");
    }

    // accessor methods

    // toString()
}