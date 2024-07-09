package ai.cluck;

import java.time.LocalDate;

public class Chicken {
    public static void speak() {
        System.out.println("Cluck! Cluck! Cluck!");
    }

    private String name = "Chicken";
    private Breed breed;
    private String gender; // constraint: ["Male", "Female"]
    private LocalDate birthDay;
    private int legs = 2; // constraint: Max of 2
    private boolean isAlive = true;
    private boolean isPregnant = false;

    // 7/3/2024 - enum and LocalDate

    public Chicken(LocalDate birthday) {
        this.setBirthDay(birthday);
    }

    public Chicken(String name, Breed breed, String gender) {
        this.setName(name);
        this.setBreed(breed);
        this.setGender(gender);
    }

    public Chicken(String name, Breed breed, String gender, LocalDate birthDay) {
        this(name, breed, gender);
        this.setBirthDay(birthDay);
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

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDate) {
        this.birthDay = birthDate;
    }

    // toString()
    public String toString() {
        return "Chicken [name=" + this.getName() + ", breed=" + this.getBreed() + ", gender=" + this.getGender() + ", born=" + this.getBirthDay() + "]";
    }
}