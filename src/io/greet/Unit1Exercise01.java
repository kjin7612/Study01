package io.greet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise01 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60)
                , new Person("Lewis", "Carroll", 42)
                , new Person("Thomas", "Carlyle", 51)
                , new Person("Charlotte", "Bronte", 45)
                , new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);
    }

    private static void printAll(List<Person> people){
        for (Person p: people){
            System.out.println(p);
        }
    }

}
