class ChickenValidationTest {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Bonnie", Breed.ORPINGTON, "Male");
        chicken.setGender("female");
        chicken.loseLeg();
        chicken.loseLeg();
        chicken.loseLeg();

        System.out.println();

        System.out.println(chicken.isPregnant());
        chicken.date();
        System.out.println(chicken.isPregnant());
        System.out.println(chicken);
    }
}