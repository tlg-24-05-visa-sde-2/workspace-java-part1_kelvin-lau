package org.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Kelvin", LocalDate.of(1995, 4, 12));
        PersonRecord p2 = new PersonRecord("Kelvin", LocalDate.of(1995, 4, 12));

        System.out.printf("%s is %s years old\n", p1.name(), p1.age());
        System.out.println(p2);
        System.out.println(p2.age());
    }
}