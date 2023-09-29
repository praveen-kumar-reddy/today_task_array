package Arraypackage;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int indexToRemove = 2;  // Index of the element to remove

        // Check if the index is valid
        if (indexToRemove < 0 || indexToRemove >= originalArray.length) {
            System.out.println("Invalid index to remove.");
            return;
        }

        // Remove the element at the specified index
        int[] newArray = new int[originalArray.length - 1];
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = originalArray[i];
            }
        }

        // Print the original array and the updated array
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Updated array: " + Arrays.toString(newArray));
    }
}
