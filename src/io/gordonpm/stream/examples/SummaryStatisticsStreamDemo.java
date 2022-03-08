package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class SummaryStatisticsStreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Trek Bicycle", 5000));
        productList.add(new Product(2, "Specialized Bicycle", 7000));
        productList.add(new Product(3, "Bianchi Bicycle", 4000));
        productList.add(new Product(4, "Canyon Bicycle", 3000));

        LongSummaryStatistics longSummaryStatistics = productList.stream()
                .collect(Collectors.summarizingLong(Product::getPrice));

        System.out.println(longSummaryStatistics);
        System.out.println("count = " + longSummaryStatistics.getCount());
        System.out.println("sum = " + longSummaryStatistics.getSum());
        System.out.println("min = " + longSummaryStatistics.getMin());
        System.out.println("max = " + longSummaryStatistics.getMax());
        System.out.println("avg = " + longSummaryStatistics.getAverage());
    }
}
