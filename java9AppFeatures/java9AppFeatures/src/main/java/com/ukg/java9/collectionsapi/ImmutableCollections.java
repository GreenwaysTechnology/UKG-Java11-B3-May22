package com.ukg.java9.collectionsapi;

import java.util.List;
import java.util.Set;

public class ImmutableCollections {
    public static void main(String[] args) {
        List numberList = List.of(1,2,3,4,5);
        numberList.forEach(System.out::println);
        //It is error : un modifiable list
//        numberList.add(90);
        numberList.forEach(System.out::println);
        Set.of(2,3,4).forEach(System.out::println);
    }
}
