package Strings;

import java.util.Locale;

public class StringAPI {
    public static void immutable(){
        String greeting = "hello world!";

        // Strings are immutable, the toUpperCase generates a new String
        System.out.println(greeting.toUpperCase());
    }
}
