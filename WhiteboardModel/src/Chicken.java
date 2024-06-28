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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    // toString()
    public String toString() {
        return "Chicken [name=" + name + ", breed=" + breed + ", gender=" + gender + "]";
    }
}