package org.example;

import java.time.LocalDate;
import java.time.Period;


public class Main{

    public static void main(String[] args) {

        Animal tiger = new Animal("Frank",LocalDate.of(2019, 12,9) );

        LocalDate nextBDay;

        if (LocalDate.now().getMonth().getValue() >= tiger.birthday().getMonth().getValue() && LocalDate.now().getDayOfMonth() >= tiger.birthday().getDayOfMonth()) {
            nextBDay = LocalDate.of(LocalDate.now().plusYears(1).getYear(),tiger.birthday().getMonth(),tiger.birthday().getDayOfMonth());
        }else {
            nextBDay = LocalDate.of(LocalDate.now().getYear(),tiger.birthday().getMonth(),tiger.birthday().getDayOfMonth());
        }
        Period p = Period.between(LocalDate.now(),nextBDay);
        System.out.println(p);
    }
}