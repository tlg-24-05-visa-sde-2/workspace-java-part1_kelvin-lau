package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

import java.util.function.DoubleToIntFunction;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    // OPTION 4: try-catch, and throw a different one back at client
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Tesla", "Model 3");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e); // include the nested 'cause'
        }
        finally {
            c.stop();
        }
    }

    // OPTION 3: try-catch, react/respond in some way, then rethrow the exception back to client
    //        public void goToWork() throws DestinationUnreachableException {
    //            Car c = new Car("ABC123", "Tesla", "Model 3");
    //            try {
    //                c.start();
    //                c.moveTo("West Seattle");
    //            } catch (DestinationUnreachableException e) {
    //                throw e;
    //            }
    //            finally {
    //                c.stop();
    //            }
    //        }

    // OPTION 2: punt - ignore the exception
    //    public void goToWork() throws DestinationUnreachableException {
    //        Car c = new Car("ABC123", "Tesla", "Model 3");
    //
    //        try {
    //            c.start();
    //            c.moveTo("West Seattle");
    //        }
    //        finally {
    //            c.stop();
    //        }
    //    }


    // OPTION 1: try-catch and handle
    //    public void goToWork() {
    //        Car c = new Car("ABC123", "Tesla", "Model 3");
    //        try {
    //            c.start();
    //            c.moveTo("West Seattle");
    //        } catch (DestinationUnreachableException e) {
    //            System.out.println(e);
    //        }
    //        finally {
    //            c.stop();
    //        }
    //    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}