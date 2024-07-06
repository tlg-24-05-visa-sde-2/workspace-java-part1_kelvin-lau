import java.time.LocalDate;
import java.util.Arrays;

class ChickenClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java ChickenClientArgs <name> <breed> <gender> <birthDay>";
            String example = "Example: java ChickenClientArgs Gonzalez SILKIE Male 2014-03-12";
            String note = "Notes: supported breeds are " + Arrays.toString(Breed.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }

        System.out.println("You provided " + args.length + " arguments.");
        System.out.println();

        String name = args[0];
        Breed breed = Breed.valueOf(args[1]);
        String gender = args[2];
        LocalDate birthDay = LocalDate.parse(args[3]);

        Chicken chicken = new Chicken(name, breed, gender, birthDay);
        System.out.println(chicken);
    }
}