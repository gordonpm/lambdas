package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapStreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Trek Bicycle", 5000));
        productList.add(new Product(2, "Specialized Bicycle", 7000));
        productList.add(new Product(3, "Bianchi Bicycle", 4000));
        productList.add(new Product(4, "Canyon Bicycle", 3000));

        Map<String, Integer> producePriceMap = productList.stream()
                .collect(Collectors.toMap(p -> p.getName(), p -> p.getPrice()));
        System.out.println(producePriceMap);
    }
}
