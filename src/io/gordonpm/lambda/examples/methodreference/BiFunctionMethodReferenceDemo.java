package io.gordonpm.lambda.examples.methodreference;

import java.util.function.BiFunction;

class Arithmetic {
    public static long add(int a, int b) {
        return a + b;
    }
}

public class BiFunctionMethodReferenceDemo {
    public static void main(String[] args) {
        // normal way using lambdas
        BiFunction<Integer, Integer, Long> adder = (a, b) -> Long.valueOf(a + b);
        System.out.println(adder.apply(40, 60));

        // using static method reference
        BiFunction<Integer, Integer, Long> adder2 = Arithmetic::add;
        long result = adder2.apply(10, 20);
        System.out.println(result);
    }
}