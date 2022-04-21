package io.gordonpm.stream.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapReturnStringDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Julie");
        map.put(2, "Maggie");
        map.put(3, "Mary");
        map.put(4, "Gina");


        String result = map.entrySet().stream()
                .filter(entry -> entry.getKey() == 2)
                .map(entry -> entry.getValue())
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
