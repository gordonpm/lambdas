package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Person;

import java.util.Arrays;
import java.util.List;

public class ShortCircuitStreamDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("George", 22),
                new Person("Peter", 33),
                new Person("Greg", 55),
                new Person("John", 35),
                new Person("George", 35));

        boolean matched = personList.stream()
                .anyMatch((s) -> s.getName().startsWith("G")); // will short circuit at Greg and not process remaining persons
        System.out.println(matched);
    }

}
