package com.ukg.java11features.innerclasses;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Outer {

    //private method of outer
    private void doStuff() {
        System.out.println("Outer Private Method");
    }

    public void createInner() {
        Inner inner = new Inner();
        inner.reflectOuter(new Outer());
    }

    class Inner {
        public void reflectOuter(Outer outer) {
            try {
                Method method = outer.getClass().getDeclaredMethod("doStuff");
                method.invoke(outer);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class AppInnerClass {
    public static void main(String[] args) {
            new Outer().createInner();
    }
}
