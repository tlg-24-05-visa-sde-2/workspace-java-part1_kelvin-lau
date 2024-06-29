class ChickenClient {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken();
        chicken1.setName("Lester");
        chicken1.setBreed("Silkie");
        chicken1.setGender("Male");



        chicken1.speak();

        System.out.println();

        System.out.println(chicken1.getName() + " pregnant: " + chicken1.isPregnant());
        chicken1.date();
        System.out.println(chicken1.getName() + " pregnant: " + chicken1.isPregnant());

        System.out.println();

        System.out.println(chicken1.getName() + " has " + chicken1.getLegs() + " legs.");
        System.out.println(chicken1.getName() + " has " + chicken1.getWings() + " wings.");
        chicken1.loseLeg();
        System.out.println(chicken1.getName() + " has " + chicken1.getLegs() + " legs.");
        System.out.println(chicken1.getName() + " has " + chicken1.getWings() + " wings.");

        System.out.println();

        System.out.println(chicken1.getName() + "'s hunger level is: " + chicken1.getHungerLevel());
        chicken1.eat();
        System.out.println(chicken1.getName() + "'s hunger level is: " + chicken1.getHungerLevel());
        chicken1.die();

        System.out.println();

        System.out.println(chicken1);
    }
}