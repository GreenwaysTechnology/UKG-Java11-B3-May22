package com.ukg.java11features.strings;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringUtilityMethods {
    public static void main(String[] args) {
        getLines();
        //white space and blank space called blank
        var res = isBlank("") ? "Blank" : "Not Blank";
        System.out.println(res);

        var stripedStr = strip(" Hello ");
        System.out.println(stripedStr);

        String repeateStr = repeat("Subramanian", 5);
        System.out.println(repeateStr);

    }

    private static String repeat(String str, int times) {
        return str.repeat(times);
    }

    public static void getLines() {
        String docs = "<html>\n <head>\n <title>" +
                "\nHello \n </title>\n</head>\n " +
                "<body>\n Welcome \n </body> ";
        System.out.println(docs);
        var listOfString = docs.lines().collect(Collectors.toList());
        System.out.println(listOfString);

        var res = listOfString.stream().filter(data -> data.contains("Welcome")).collect(Collectors.toList());
        System.out.println(res);
    }

    //isBlank
    public static boolean isBlank(String str) {
        return str.isBlank();
    }

    //strip
    public static String strip(String str) {
        return str.strip();
    }


}
