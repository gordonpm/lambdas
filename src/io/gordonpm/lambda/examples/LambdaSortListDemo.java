package io.gordonpm.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSortListDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 33),
                new Person("Greg", 32),
                new Person("Peter", 31),
                new Person("George", 40)
                );
        printAll(personList);


        Collections.sort(personList,
                (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("after sort by name in ascending order: ");
        printAll(personList);

        Collections.sort(personList,
                (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("after sort by age in ascending order: ");
        printAll(personList);

        Collections.sort(personList,
                (p1, p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println("after sort by name in descending order: ");
        printAll(personList);

        Collections.sort(personList,
                (p1, p2) -> p2.getAge() - p1.getAge());
        System.out.println("after sort by age in descending order: ");
        printAll(personList);
    }

    private static void printAll(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
