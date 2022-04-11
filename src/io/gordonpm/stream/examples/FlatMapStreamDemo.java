package io.gordonpm.stream.examples;

import java.util.Arrays;

public class FlatMapStreamDemo {
    public static void main(String[] args) {
        Integer[][] integerArray = {{1, 2}, {3, 4}, {5, 6}};
        Arrays.stream(integerArray).flatMap(row -> Arrays.stream(row))
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);
    }
}
