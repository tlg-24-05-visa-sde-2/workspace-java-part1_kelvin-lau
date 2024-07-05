/*
 * An immutable class.
 * That is, a class definition written in such a way that instances of it (Person objects),
 * once created, cannot have their properties changed.
 * There are simply no public methods to do so, i.e., getters, but NO setters.
 */

import java.time.LocalDate;

class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int age() {
        return LocalDate.now().compareTo(birthDate);
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Name: %s, Birth Date: %s\n", name, birthDate);
    }
}