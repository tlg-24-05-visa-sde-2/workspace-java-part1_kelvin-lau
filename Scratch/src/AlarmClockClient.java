/*
 * Client-side "main-class" i.e., the class definition with main().
 * That's the ONLY thing in here.
 */

class AlarmClockClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        // create an instance of AlarmClock
        AlarmClock clock1 = new AlarmClock();
        clock1.snoozeInterval = 7;

        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        AlarmClock clock3 = new AlarmClock();

        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}