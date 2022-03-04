package io.gordonpm.lambda.examples.methodreference.nonstatic;

public class NonStaticMethodReferenceThreadDemo {
    public void runThis() {
        System.out.println("Running thread");
    }
    public static void main(String[] args) {
        NonStaticMethodReferenceThreadDemo nonStaticMethodReferenceThreadDemo = new NonStaticMethodReferenceThreadDemo();
        Runnable runnable = nonStaticMethodReferenceThreadDemo::runThis; // non-static method reference
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
