package Arraypackage;

import java.util.Arrays;

public class Remove_element {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60,70,80,90,100};
        int indexToRemove = 8; // Index of the element to remove

        // Check if the index is valid
        if (indexToRemove < 0 || indexToRemove >= arr.length) {
            System.out.println("Invalid index to remove.");
            return;
        }

        // Shift the elements to fill the gap
        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Resize the array to remove the last element
        arr = Arrays.copyOf(arr, arr.length - 1);

        // Print the updated array with indices
        System.out.print("Updated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + ": " + arr[i] + "] ");
        }
        System.out.println();
    }
}

