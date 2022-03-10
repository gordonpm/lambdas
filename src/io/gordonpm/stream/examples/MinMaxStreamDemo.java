package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxStreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Trek Bicycle", 5000));
        productList.add(new Product(2, "Specialized Bicycle", 7000));
        productList.add(new Product(3, "Bianchi Bicycle", 4000));
        productList.add(new Product(4, "Canyon Bicycle", 3000));

        Product productWithMaxPrice = productList.stream()
                .max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
                .get();
        System.out.println(productWithMaxPrice);

        Product productWithMinPrice = productList.stream()
                .min((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
                .get();
        System.out.println(productWithMinPrice);

        productWithMaxPrice = productList.stream()
                .max(Comparator.comparing(Product::getPrice))
                .get();
        System.out.println(productWithMaxPrice);
    }
}
