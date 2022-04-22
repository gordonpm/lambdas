package io.gordonpm.stream.examples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveIntToStreamIntDemo {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(intArray[1][2]);
        Stream<int[]> arrayStream = Stream.of(intArray);
        IntStream intStream = arrayStream.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x -> System.out.println(x));
    }
}
