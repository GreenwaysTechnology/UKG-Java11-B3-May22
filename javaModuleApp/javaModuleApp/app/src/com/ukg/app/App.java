package com.ukg.app;

import com.ukg.greeter.Greeter;

import java.sql.Connection;
//import com.ukg.hello.HelloWorld;

public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        //try to access class of which is un exported
//        HelloWorld helloWorld = new HelloWorld();
    }
    public static  void sqlConnect(){
        Connection connection;
    }
}
