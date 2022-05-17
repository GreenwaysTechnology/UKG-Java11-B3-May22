package com.ukg.reflect;

import com.ukg.greeter.Greeter;

import java.lang.reflect.Field;

public class ReflectMain {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Class<?> theClass = greeter.getClass();
        Field[] declaredFields = theClass.getDeclaredFields();
        System.out.println(declaredFields.length);
    }
}
