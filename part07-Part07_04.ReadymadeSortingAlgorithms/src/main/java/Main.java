import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void sort(int[] array) {
        Arrays.sort(array); // uses dual-pivot quicksort internally
    }

    public static void sort(String[] array) {
        Arrays.sort(array); // lexicographic sort
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers); // ascending order
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings); // alphabetical order
    }

    public static void main(String[] args) {
        // Test examples
        int[] nums = {5, 2, 9, 1};
        sort(nums);
        System.out.println("Sorted int[]: " + Arrays.toString(nums));

        String[] words = {"banana", "apple", "cherry"};
        sort(words);
        System.out.println("Sorted String[]: " + Arrays.toString(words));

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(7, 3, 8, 2));
        sortIntegers(numList);
        System.out.println("Sorted ArrayList<Integer>: " + numList);

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("zebra", "lion", "elephant"));
        sortStrings(wordList);
        System.out.println("Sorted ArrayList<String>: " + wordList);
    }
}
