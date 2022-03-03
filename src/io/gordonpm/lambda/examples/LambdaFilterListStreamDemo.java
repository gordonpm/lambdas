package io.gordonpm.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFilterListStreamDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 23),
                new Person("Greg", 21),
                new Person("Peter", 31),
                new Person("George", 40)
        );

        personList.forEach(person -> System.out.println(person));

        personList.forEach(System.out::println); // method reference

        Stream<Person> filteredStream = personList.stream().filter(p -> p.getAge() > 30); // Predicate<Person> implementation (filter)
        filteredStream.forEach(person -> System.out.println(person)); //Consumer<Person> implementation
    }
}
