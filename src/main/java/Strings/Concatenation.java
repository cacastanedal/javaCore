package Strings;

public class Concatenation {
    public static void printUnicode(){
        // In java, all chars are unicode
        String tradeMarkUnicode = "\u2122";
        System.out.println("Java"+tradeMarkUnicode);
    }

    public static void concatenation(){
        // non String/Char values are converted to string
        int anos = 30;
        System.out.println("I am "+ anos + " years old");
        System.out.println("Next year I'll be " + (anos + 1));

        // for multiple Strings.Strings, somewhat inefficient
        String names = String.join(", ", "Carlos", "Andreina", "Peque");
        System.out.println(names);

        // if the result String is the important one, more efficient
        StringBuilder builder = new StringBuilder();
        builder.append("Peque");
        builder.append(", Andreina");
        builder.append(", Carlos");
        String namesFromBuilder = builder.toString();
        System.out.println(namesFromBuilder);
    }
}
