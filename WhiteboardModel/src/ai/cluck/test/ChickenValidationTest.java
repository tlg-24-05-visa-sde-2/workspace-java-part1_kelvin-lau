package ai.cluck.test;

import ai.cluck.Breed;
import ai.cluck.Chicken;

class ChickenValidationTest {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("Bonnie", Breed.ORPINGTON, "Male");
        chicken1.setGender("female");
        chicken1.loseLeg();
        chicken1.loseLeg();
        chicken1.loseLeg();

        System.out.println();

        // Pregnant should be true since this chicken1 is female
        // This uses a constraint within the private mate() that gets called inside the public date()
        System.out.println(chicken1.isPregnant());
        chicken1.date();
        System.out.println(chicken1.isPregnant());
        System.out.println(chicken1);

        Chicken chicken2 = new Chicken("Alvin", Breed.AMERAUCANA, "Male");
        System.out.println(chicken2.isPregnant());
        chicken2.date();
        System.out.println(chicken2.isPregnant());
        System.out.println(chicken2);
    }
}