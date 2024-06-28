class ChickenClient {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken();
        chicken1.name = "Lester";
        chicken1.speak();

        System.out.println(chicken1.name + " has " + chicken1.legs + " legs.");
        System.out.println(chicken1.name + " has " + chicken1.wings + " wings.");
        chicken1.loseLeg();
        System.out.println(chicken1.name + " has " + chicken1.legs + " legs.");
        System.out.println(chicken1.name + " has " + chicken1.wings + " wings.");
        System.out.println(chicken1.name + "'s hunger level is: " + chicken1.hungerLevel);
        chicken1.eat();
        System.out.println(chicken1.name + "'s hunger level is: " + chicken1.hungerLevel);
        chicken1.die();
    }
}