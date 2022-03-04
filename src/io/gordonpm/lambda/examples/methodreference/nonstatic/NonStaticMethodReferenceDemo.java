package io.gordonpm.lambda.examples.methodreference.nonstatic;

@FunctionalInterface
interface Dog {
    void eat();
}

public class NonStaticMethodReferenceDemo {
    public void dogEating() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        NonStaticMethodReferenceDemo nonStaticMethodReferenceDemo = new NonStaticMethodReferenceDemo();
        Dog dog = nonStaticMethodReferenceDemo::dogEating; // non-static method reference
        dog.eat();
    }
}