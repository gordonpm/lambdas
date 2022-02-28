package io.gordonpm.lambda.examples;

import io.gordonpm.lambda.examples.filter.PersonFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaFilterListPredicateDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 33),
                new Person("Greg", 32),
                new Person("Peter", 31),
                new Person("George", 40)
        );
        printNameBeginWith_G(personList, person -> person.getName().startsWith("G"));
    }

    private static void printNameBeginWith_G(List<Person> personList, Predicate<Person> predicate) {
        for (Person person : personList) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }

}
