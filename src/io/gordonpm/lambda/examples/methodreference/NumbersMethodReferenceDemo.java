package io.gordonpm.lambda.examples.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumbersMethodReferenceDemo {
    public static boolean isLessThanFifty(int number) {
        return number < 50;
    }

    public static List<Integer> findNumbers(List<Integer> list, Predicate<Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (p.test(i)) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 55, 75, 88, 24, 40);

        // Using anonymous clas
        List<Integer> listOfLessThanFiftyNumbers = NumbersMethodReferenceDemo.findNumbers(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return NumbersMethodReferenceDemo.isLessThanFifty(i);
            }
        });

        System.out.println("listOfLessThanFiftyNumbers - anonymous class = " + listOfLessThanFiftyNumbers);

        // using Lambda expression
        listOfLessThanFiftyNumbers = NumbersMethodReferenceDemo.findNumbers(list, i -> NumbersMethodReferenceDemo.isLessThanFifty(i));
        System.out.println("listOfLessThanFiftyNumbers - lambda expression = " + listOfLessThanFiftyNumbers);

        // using method reference
        listOfLessThanFiftyNumbers = NumbersMethodReferenceDemo.findNumbers(list, NumbersMethodReferenceDemo::isLessThanFifty);
        System.out.println("listOfLessThanFiftyNumbers - method reference = " + listOfLessThanFiftyNumbers);
    }
}
