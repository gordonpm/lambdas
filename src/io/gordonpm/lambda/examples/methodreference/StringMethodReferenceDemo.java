package io.gordonpm.lambda.examples.methodreference;

@FunctionalInterface
interface MessageInfo {
    String displayMessage(char[] msg);
}
public class StringMethodReferenceDemo {
    public static void main(String[] args) {
        MessageInfo messageInfo = String::new;
        char[] charArray = {'G', 'e', 'o', 'r', 'g', 'e'};
        System.out.println(messageInfo.displayMessage(charArray));
    }
}
