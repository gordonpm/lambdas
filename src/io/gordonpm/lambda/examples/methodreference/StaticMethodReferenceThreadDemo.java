package io.gordonpm.lambda.examples.methodreference;

public class StaticMethodReferenceThreadDemo {
    public static void runThis() {
        System.out.println("Running thread");
    }
    public static void main(String[] args) {
        Runnable runnable = StaticMethodReferenceThreadDemo::runThis; // static method reference
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
