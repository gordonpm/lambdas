package io.gordonpm.stream.examples;

import java.util.stream.Stream;

public class StreamIterateDemo {
    public static void main(String[] args) {
        Stream.iterate(1, e -> e < 5, e -> e + 1)
                .forEach(System.out::println);

        Stream.iterate(1, e -> e + 1)
                .filter(e -> e % 10 == 0)
                .limit(5)
                .forEach(System.out::println);

    }
}
