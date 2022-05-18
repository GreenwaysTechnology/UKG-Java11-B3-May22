package com.ukg.java10features.typeinference;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FlightService {

    //instance variables
    //var i; - not possible

    public String getFlightInfo() {
        return "Air India";
    }
}

@FunctionalInterface
interface Greeter {
    String greet();
}

interface Flyable {
    void fly();
}

class Flight implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flight is flying");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class App {
    public static void main(String[] args) {
        //declare variable in old java style
        int a = 10;
        System.out.println("A " + a);
        var b = 100;
        System.out.println("B " + b);
        var firstName = "Subramanian";
        var status = true;
        var points = 1.5F;
        System.out.println(firstName + " " + status + " " + points);
        var x = 10.5f;
        var y = 100;
        var r = x * y;
        System.out.println(r);
        //collections
        var list = List.of("Java 11", "Java 17");
        System.out.println(list);
        var numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(22);
        System.out.println(numbers);
        var numList = List.of(1, 2, 3, 4, 5, 6, 7, 10);
        var stream = numbers.stream();
        var filteredList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        filteredList.forEach(System.out::println);

        //object creation for var
//        FlightService flightService = new FlightService();
        var flightService = new FlightService();
        System.out.println(flightService.getFlightInfo());

        //var cant have null vaues
        // var myservice = null;
        //var must have been initalized
        //var myservice;
        //var and lambda expression
        Greeter greeter = new Greeter() {
            @Override
            public String greet() {
                return "Hello";
            }
        };
        System.out.println(greeter.greet());

        var greeter1 = new Greeter() {
            @Override
            public String greet() {
                return "Hello";
            }
        };
        System.out.println(greeter1.greet());

        //lambda
        Greeter greeter2 = () -> "Hello";
        System.out.println(greeter2.greet());

        //var will not work with lambda type
//        var greeter3 = () -> "Hello";
//        System.out.println(greeter2.greet());

//
        //var cant be used with super Type; runtime polymorphism
//        Flyable flyable = new Flight();
//        var flyable = new Flight();
//
//        flyable.fly();
//
//        flyable = new Bird();
//        flyable.fly();

        var j = 10;
        j = 90;


    }
}
