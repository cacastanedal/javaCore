package arrays;

import java.util.Arrays;

public class Construction {

    public static void basicStringArray(){
        String[] names;

        // array of Strings with 100 elements
        names = new String[100];

        // arrays of objects are created with null values
        System.out.println(names[39]);

        for (int i = 0; i< names.length; i++){
            names[i] = String.valueOf(i);
        }

        System.out.println(names[39]);
    }

    public static void defaultValues(){
        int[] numbers = new int[10];

        // numbers array should initialize with zero as values
        System.out.println(numbers[7]);

        boolean[] states = new boolean[30];

        // boolean array should initialize with false
        System.out.println(states[27]);

        String[] names = new String[50];

        // String array should initialize with null as values
        System.out.println(names[43]);
    }

    public static void withParameters(){
        int[] primes = {2, 3, 5, 7, 11, 13};

        System.out.println(primes);

        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele",
                // trailing comma to add more in future
        };

        System.out.println(authors);
    }

    public static void copyingArrays(){
        int[] primes = {2, 3, 5, 7, 11, 13};

        int[] numbers = primes;

        numbers[5] = 42;

        System.out.println(primes[5]);

        int[] anotherPrimes = Arrays.copyOf(primes, primes.length);

        anotherPrimes[0] = 100;

        System.out.println(primes[0]);
    }
}
