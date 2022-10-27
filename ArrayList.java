import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class array {

    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }

    // Driver code
    public static void main(String args[]) {

        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(
                Arrays
                        .asList(10002695, 10011733, 10015636, 10018393, 10016740, 10013563, 10011638, 10016060,
                                10016060, 10013878, 10015157, 10011752, 10015253, 10018606, 10018606, 10010962,
                                10014593, 10009917, 10011931, 10015170, 10020076, 10018992, 10017774, 10017774,
                                10010654, 10014603, 10014332, 10009867, 10014215, 10013336));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
}