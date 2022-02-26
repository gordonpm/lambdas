package io.gordonpm.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPredicateConsumerDemo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", 33),
                new Person("Greg", 32),
                new Person("George", 40),
                new Person("Peter", 31));

        System.out.println("------------Name Starts with G---------");
        /*
         * Create a method that prints all people that have name
         * begins with B.
         */
        printNameBeginWith_G(personList,
                p -> p.getName().startsWith("G"),
                p -> System.out.println(p));

        System.out.println("---------------------------------------");

        printNameBeginWith_G(personList,
                p -> p.getName().startsWith("G"),
                p -> System.out.println(p.getName()));

        System.out.println("---------------------------------------");

        printNameBeginWith_G(personList,
                p -> p.getName().startsWith("G"),
                p -> System.out.println(p.getAge()));

    }

    private static void printNameBeginWith_G(List<Person> personList,
                                             Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }

    }
}
