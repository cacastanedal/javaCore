package inputOutput;

import java.util.Scanner;

public class ReadingInput {

    public static void readStandardInputStream(){
        // standard output streams, shows up in a terminal window
        System.out.println("Standard output stream");

        // reading from the standard input stream
        Scanner in = new Scanner(System.in);
        // String name = in.nextLine();

        // reading single world, delimited by whitespace
        // String firstName = in.next();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println(age + "? You old!");
    }
}
