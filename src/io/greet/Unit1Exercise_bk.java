package io.greet;

import java.util.List;

public class Unit1Exercise_bk {
    public static void main(String[] args) {
//        List<Person> people = Arrays.asList(
//            new Person("Charles", "Dickens", 60)
//            , new Person("Lewis", "Carroll", 42)
//            , new Person("Thomas", "Carlyle", 51)
//            , new Person("Charlotte", "Bronte", 45)
//            , new Person("Matthew", "Arnold", 39)
//        );

        // Step 1: Sort List by Last Name
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });

        // Step 2: Create a method that prints all elements in the list
//        printAll(people);

        // Step 3: Create a method that prints all people that have name beginning with C
    }

    private static void printAll(List<Person> people){
        for(Person p : people){
            System.out.println(p);
        }
    }
}
