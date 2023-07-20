package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class SortingDuplicateList {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
       // numbers.add(2);
//        numbers.add(4);
//        numbers.add(1);

        // Use a HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);


        // Create a new ArrayList from the HashSet
        ArrayList<Integer> result = new ArrayList<>(uniqueNumbers);


        // Print the ArrayList with duplicate elements removed
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("ArrayList after removing duplicates: " + result);
    }
}


