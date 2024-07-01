/*
 * Client-side "main-class" i.e., the class definition with main().
 * That's the ONLY thing in here.
 */

class AlarmClockClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        // create an instance of AlarmClock
        AlarmClock clock1 = new AlarmClock(-7);

        AlarmClock clock2 = new AlarmClock(11);

        AlarmClock clock3 = new AlarmClock(1);

        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        System.out.println(clock1);
    }
}