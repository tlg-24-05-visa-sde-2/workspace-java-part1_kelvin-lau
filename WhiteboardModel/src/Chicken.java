class Chicken {
    String name = "Chicken";
    String breed; // constraint: ["Silkie", "Sussex", "Leghorn", etc.]
    String gender; // constraint: ["Male", "Female"]
    int age; // constraint: Min of 0
    int legs = 2; // constraint: Max of 2
    int wings = 2; // constraint: Max of 2
    double hungerLevel = 50.0; // constraint: Between 0 and 100
    boolean isAlive = true;
    boolean isHungry = false;

    void speak() {
        System.out.println("Cluck! Cluck! Cluck!");
    }

    void eat() {
        System.out.println(this.name + " is eating...");
        this.hungerLevel += 5;
    }

    void loseWing() {
        this.wings--;
    }

    void loseLeg() {
        System.out.println(this.name + " has lost a leg!");
        this.legs--;
    }

    void die() {
        System.out.println(this.name + " has died...");
    }
}