package io.gordonpm.lambda.examples;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
public class MathOperationWithLambda {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("10 + 5 = " + MathOperationWithLambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + MathOperationWithLambda.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + MathOperationWithLambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + MathOperationWithLambda.operate(10, 5, division));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
