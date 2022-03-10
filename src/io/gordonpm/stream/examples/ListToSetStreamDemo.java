package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetStreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Trek Bicycle", 5000));
        productList.add(new Product(2, "Specialized Bicycle", 7000));
        productList.add(new Product(3, "Bianchi Bicycle", 4000));
        productList.add(new Product(4, "Canyon Bicycle", 3000));
        productList.add(new Product(5, "Specialized Bicycle", 5000));

        Set<Integer> productPriceSet = productList.stream()
                .filter(product -> product.getPrice() < 7000)
                .map(product -> product.getPrice())
                .collect(Collectors.toSet());
        System.out.println(productPriceSet);
    }
}
