package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Person;

import java.util.Arrays;
import java.util.List;

public class ListFilterStreamDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("George", 22),
                new Person("Peter", 33),
                new Person("Greg", 55),
                new Person("John", 35));

        Person person = personList.stream()
                .filter(p -> p.getName().equals("Peter"))
                .findAny()
                .orElse(null);
        System.out.println(person);

        personList.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
    }
}
