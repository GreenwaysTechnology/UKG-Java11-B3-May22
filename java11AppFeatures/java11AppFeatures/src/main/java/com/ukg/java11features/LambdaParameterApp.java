package com.ukg.java11features;

@FunctionalInterface
interface Welcome {
    void sayHello(String name, String message);
}


public class LambdaParameterApp {
    public static void main(String[] args) {
        Welcome welcome = null;
        welcome = (String name, String message) -> System.out.println(message + name);
        welcome.sayHello("Subramanian", "Hello");
        welcome = (name, message) -> System.out.println(message + name);
        welcome.sayHello("Subramanian", "Hello");
        //java 11 feature
        welcome = (var name, var message) -> System.out.println(message + name);
        welcome.sayHello("Subramanian", "Hello");

    }
}
