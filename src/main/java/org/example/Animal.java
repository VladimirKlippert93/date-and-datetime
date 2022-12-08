package org.example;

import java.time.LocalDate;

public record Animal(
        String name,
        LocalDate birthday
) {
}
