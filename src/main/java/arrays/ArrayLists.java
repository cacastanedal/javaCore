package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    // Arrays with undefined length
    // No special syntax as [] or [n] to access elements
    // Generic class, class with Type parameter

    public static void example(){
        // The new ArrayList<> does not need the Type because it was said at the variable declaration
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Peter");
        friends.add("Paul");

        // No initializer syntax for arrayLists
        ArrayList<String> family = new ArrayList<>(List.of("CarlosB", "DiegaV"));

        family.remove(1);
        family.add(0, "Peque");

        String firstFriend = friends.get(0);
        friends.set(1, "Mary");

        // Enhanced for loop
        for (String friend : friends) {
            System.out.println(friend);
        }

        for (String fam : family){
            System.out.println(fam);
        }

    }
}
