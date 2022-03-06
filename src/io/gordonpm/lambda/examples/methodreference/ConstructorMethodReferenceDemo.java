package io.gordonpm.lambda.examples.methodreference;

@FunctionalInterface
interface Messageable {
    Message getMessage(String message);
}

class Message {
    public Message(String msg) {
        System.out.println(msg);
    }
}

public class ConstructorMethodReferenceDemo {
    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.getMessage("Hello");
    }
}
