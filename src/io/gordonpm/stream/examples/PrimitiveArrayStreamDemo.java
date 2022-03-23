package io.gordonpm.stream.examples;

import java.util.Arrays;

public class PrimitiveArrayStreamDemo {
    public static void main(String[] args) {
        int[] nums = {2, 1, 9 };
        System.out.println(Arrays.stream(nums).sum());

        System.out.println(Arrays.stream(nums).count());

        System.out.println(Arrays.stream(nums).average().getAsDouble());

    }
}
