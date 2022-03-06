package io.gordonpm.lambda.examples.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateMethodReferenceDemo {
    public static boolean isGreaterThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }

    public static List<Integer> findNumbers(List<Integer> list, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (p.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);
        List<Integer> listOfNumbers = BiPredicateMethodReferenceDemo.findNumbers(list, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer i1, Integer i2) {
                return BiPredicateMethodReferenceDemo.isGreaterThanFifty(i1, i2);
            }
        });
        System.out.println("listOfNumber using anonymous class = " + listOfNumbers);

        // Using lambda expression
        listOfNumbers = BiPredicateMethodReferenceDemo.findNumbers(list, (i1, i2) -> BiPredicateMethodReferenceDemo.isGreaterThanFifty(i1, i2));
        System.out.println("listOfNumber using lambda expression = " + listOfNumbers);

        // Using method reference
        listOfNumbers = BiPredicateMethodReferenceDemo.findNumbers(list, BiPredicateMethodReferenceDemo::isGreaterThanFifty);
        System.out.println("listOfNumber using method reference = " + listOfNumbers);
    }
}
