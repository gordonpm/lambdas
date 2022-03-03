package io.gordonpm.lambda.examples.methodreference;

public class MethodReferenceThreadDemo {
    public static void runThis() {
        System.out.println("Running thread");
    }
    public static void main(String[] args) {
        Runnable runnable = MethodReferenceThreadDemo::runThis;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
