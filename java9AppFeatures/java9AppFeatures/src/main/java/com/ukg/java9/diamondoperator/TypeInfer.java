package com.ukg.java9.diamondoperator;

abstract class ABCD<T>{
    abstract T show(T a, T b);
}
public class TypeInfer {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a+b;
            }
        };
        String result = a.show("Java","9");
        System.out.println(result);

        ABCD<Integer> b = new ABCD<>() {
            @Override
            Integer show(Integer a, Integer b) {
                return a.intValue() * b.intValue();
            }
        };
        System.out.println(b.show(10,10));
    }
}
