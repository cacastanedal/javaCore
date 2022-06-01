package Strings;

public class CodePoints {

    public static void unicodeValue(){
        // all correct unicode values are called code point
        // today unicode uses 21 bits
        // for letter A
        System.out.println("Letter \u0041");
        // for math simbol golden ratio
        System.out.println("Symbol \u03D5");
    }

    public static void UTF16(){
        // Java was designed with 16bits unicode in mind
        // all characters beyond U+FFFF uses surrogate characters
        System.out.println("Symbol \ud835\udd46");

    }
}
