package io.gordonpm.lambda.examples.filter;

import io.gordonpm.lambda.examples.Person;

import java.util.Arrays;
import java.util.List;

public class LambdaFilterListDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 33),
                new Person("Greg", 32),
                new Person("Peter", 31),
                new Person("George", 40)
        );
        PersonFilter personFilter = person -> person.getName().startsWith("G");
        printNameBeginWith_G(personList, personFilter);
    }

    private static void printNameBeginWith_G(List<Person> personList, PersonFilter personFilter) {
        for (Person person : personList) {
            if (personFilter.filter(person)) {
                System.out.println(person);
            }
        }
    }
}
