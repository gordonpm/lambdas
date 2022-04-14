package io.gordonpm.stream.examples;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekStreamDemo {
    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        int[] intArray = {5, 10, 15, 20};
        Arrays.stream(intArray).skip(2).forEach(System.out::println); // will skip first 2 numbers

    }
}
