import java.time.LocalDate;

class Chicken {
    private String name = "Chicken";
    private Breed breed;
    private String gender; // constraint: ["Male", "Female"]
    private LocalDate birthDate;
    private int age; // constraint: Min of 0
    private int legs = 2; // constraint: Max of 2
    private int wings = 2; // constraint: Max of 2
    private double hungerLevel = 50.0; // constraint: Between 0 and 100
    private boolean isAlive = true;
    private boolean isPregnant = false;

    // 7/3/2024 - enum and LocalDate

    public Chicken(LocalDate birthday) {
        this.setBirthDate(birthday);
    }

    public Chicken(String name, Breed breed) {
        this.setName(name);
        this.setBreed(breed);

    }

    public Chicken(String name, Breed breed, String gender) {
        this(name, breed);
        this.setBreed(breed);
        this.setGender(gender);
    }

    public void speak() {
        System.out.println("Cluck! Cluck! Cluck!");
    }

    public void date() {
        System.out.println(this.name + " is going on a date...");
        mate();
    }

    private void mate() {
        if (this.gender.equals("female") || this.gender.equals("Female")) {
            this.isPregnant = true;
        }
    }


    public void eat() {
        System.out.println(this.name + " is eating...");
        this.hungerLevel += 5;
    }

    public void loseWing() {
        if (this.getWings() > 0) {
            this.setWings((this.getWings() - 1));
        } else {
            System.out.println(this.getName() + " has no more wings to lose!");
        }

    }

    public void loseLeg() {
        if (this.getLegs() > 0) {
            this.setLegs((this.getLegs() - 1));
            System.out.println(this.name + " has lost a leg!");
        } else {
            System.out.println(this.getName() + " has no more legs to lose!");
        }
    }

    public void die() {
        System.out.println(this.name + " has died...");
    }

    // accessor methods

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWings() {
        return this.wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public double getHungerLevel() {
        return this.hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public boolean isPregnant() {
        return this.isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.isPregnant = pregnant;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // toString()
    public String toString() {
        return "Chicken [name=" + this.getName() + ", breed=" + this.getBreed() + ", gender=" + this.getGender() + ", born=" + this.getBirthDate() + "]";
    }
}