package io.gordonpm.lambda.examples.methodreference;

@FunctionalInterface
interface Person {
    void walk();
}

public class StaticMethodReferenceDemo {
    public static void personWalking() {
        System.out.println("Walking on the road");
    }
    public static void main(String[] args) {
        Person person = StaticMethodReferenceDemo::personWalking; // static method reference
        person.walk();
    }
}
