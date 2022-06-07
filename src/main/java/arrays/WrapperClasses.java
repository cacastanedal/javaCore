package arrays;

import java.util.ArrayList;

public class WrapperClasses {
    // generics classes don't receive primitive values
    // E.g. ArrayList<int> is illegal

    public static void example() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // autoboxing 42 from int to Integer
        numbers.add(42);
        numbers.add(42);

        // unboxing Integer 42 to int
        int first = numbers.get(0);

        System.out.println(first);

        // WrapperClasses and equals

        // Wrong
        System.out.println(numbers.get(0) == numbers.get(1));

        // Right because they are Objects
        System.out.println(numbers.get(0).equals(numbers.get(1)));
    }
}
