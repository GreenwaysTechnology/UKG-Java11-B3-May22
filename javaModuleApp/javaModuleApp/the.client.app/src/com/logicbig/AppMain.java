package com.logicbig;
import com.util.ReflectionUtil;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) throws IllegalAccessException {
        MyService obj = new MyService(4, "test string");
        Map<String, Object> map = ReflectionUtil.getProperties(obj);
        System.out.println(map);
    }
}