package ai.cluck.client;

import ai.cluck.Breed;
import ai.cluck.Chicken;

import java.time.LocalDate;

class ChickenClient {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken(LocalDate.now());
        chicken1.setName("Lester");
        chicken1.setBreed(Breed.SILKIE);
        chicken1.setGender("Male");

        chicken1.speak();

        System.out.println();

        System.out.println(chicken1.getName() + " pregnant: " + chicken1.isPregnant());
        chicken1.date();
        System.out.println(chicken1.getName() + " pregnant: " + chicken1.isPregnant());

        System.out.println();

        System.out.println(chicken1.getName() + " has " + chicken1.getLegs() + " legs.");
        chicken1.loseLeg();
        System.out.println(chicken1.getName() + " has " + chicken1.getLegs() + " legs.");

        System.out.println();

        chicken1.die();

        System.out.println();

        System.out.println(chicken1);
    }
}