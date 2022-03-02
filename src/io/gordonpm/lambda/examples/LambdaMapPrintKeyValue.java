package io.gordonpm.lambda.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaMapPrintKeyValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Julie");
        map.put(2, "Maggie");
        map.put(3, "Mary");
        map.put(4, "Gina");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v)); // BiConsumer<K, V> implementation
    }
}
