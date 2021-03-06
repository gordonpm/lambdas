package io.gordonpm.lambda.examples.methodreference.nonstatic;

import java.util.function.BiFunction;

class Arithmetic {
    public long add(int a, int b) {
        return a + b;
    }
}

public class BiFunctionNonStaticMethodReferenceDemo {
    public static void main(String[] args) {
        // normal way using lambdas
        BiFunction<Integer, Integer, Long> adder = (a, b) -> Long.valueOf(a + b);
        System.out.println(adder.apply(40, 60));

        // using non-static method reference
        Arithmetic arithmetic = new Arithmetic();
        BiFunction<Integer, Integer, Long> adder2 = arithmetic::add;
        long result = adder2.apply(10, 20);
        System.out.println(result);
    }
}