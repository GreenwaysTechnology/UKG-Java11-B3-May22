package com.ukg;

import com.ukg.demo.test.Demo;
import com.ukg.greet.Greeter;

public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayGreet());
        Demo demo = new Demo();
        demo.doStuff();

    }
}
