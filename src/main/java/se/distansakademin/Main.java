package se.distansakademin;

import java.util.Arrays;

import se.distansakademin.Problems;

public class Main {
    public static void main(String[] args) {
        // Create unsorted array of numbers
        int[] searchPlace = { 1, 3, 4, 5, 7, 9 };

        int foundIndex = Problems.BinarySearch(searchPlace, 5);

        System.out.println(foundIndex);

    }

    private static void temp(){
        // Create unsorted array of numbers
        int[] unsorted = {5, 3, 8, 1, 2};

        // Sort array with built-in function
        int[] sortedBuiltIn = Problems.SortIntegers_BuiltIn(unsorted);

        // Create String of numbers from array
        String output = Arrays.toString(sortedBuiltIn);

        // Print the string of numbers
        System.out.println(output);
    }

    private static void temp2(){
        // Create unsorted array of numbers
        int[] unsorted = { 5, 3, 8, 1, 2, 3 };

        // Sort integers with manual method
        int[] sorted = Problems.SortIntegers_Manual(unsorted);

        // Create String of numbers from array
        String output = Arrays.toString(sorted);

        // Print the string of numbers
        System.out.println(output);
    }
}