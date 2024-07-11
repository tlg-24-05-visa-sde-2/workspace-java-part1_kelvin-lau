package org.human;

import java.time.LocalDate;

public record PersonRecord(String name, LocalDate birthDate) {

    public int age() {
        return LocalDate.now().compareTo(birthDate);
    }
}
