package io.snooze;/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */

class AlarmClock {
    // class ("static") fields - ONE copy shared among all instances
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;



    // constructors
    public AlarmClock() {

    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation/conversion
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + this.getSnoozeInterval() + " minutes.");
    }

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval < MIN_INTERVAL || snoozeInterval > MAX_INTERVAL) {
            System.out.println("Invalid snooze interval: " + snoozeInterval + "\nSnooze interval must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).");
        } else {
            this.snoozeInterval = snoozeInterval;
        }

    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + this.getSnoozeInterval();
    }
}