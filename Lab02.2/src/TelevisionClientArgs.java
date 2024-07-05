/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
import java.util.Arrays;

class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Notes: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Valid range for volume is: " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
            String note3 = "Brand must be: Sony, Samsung, LG, Toshiba";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
        System.out.println();

        // STEP 1. convert argument strings into proper types for Television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // STEP 2. create an instance of Television with these converted values
        Television television = new Television(brand, volume, display);

        // STEP 3. print it (toString()) and congratulate them on their order
        System.out.println(television);
        System.out.println("Thank you for your order!");
    }
}