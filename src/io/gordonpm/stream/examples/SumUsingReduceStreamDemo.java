package io.gordonpm.stream.examples;

import io.gordonpm.lambda.examples.Product;

import java.util.ArrayList;
import java.util.List;

public class SumUsingReduceStreamDemo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Trek Bicycle", 5000));
        productList.add(new Product(2, "Specialized Bicycle", 7000));
        productList.add(new Product(3, "Bianchi Bicycle", 4000));
        productList.add(new Product(4, "Canyon Bicycle", 3000));

        Integer totalPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(0, (sum, price) -> sum + price); // sum, price can be replaced by any variables
        System.out.println(totalPrice);

        totalPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(0, Integer::sum); // sum, price can be replaced by any variables
        System.out.println(totalPrice);
    }
}
