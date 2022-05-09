package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Hello");
        hs.add("Hi");
        hs.add("Bye");
        hs.add("Good");
        hs.add("Great");
        hs.add("Best");
        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing Best from HashSet: " + hs.remove("Best"));
        //Remove element that is not present
        if(hs.remove("Game")) {
            System.out.println("Game removed from the Set");
        } else {
            System.out.println("Game is not present in the Set");
        }
        System.out.println("Checking if Bye is present: " + hs.contains("Bye"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);


    }
}
