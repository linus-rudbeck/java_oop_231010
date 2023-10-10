package se.distansakademin;

import java.util.Arrays;

public class Problems {
    public static int CountVowels(String input){
        int count = 0;
                       //0123456...
        String vowels = "aouåeiyäöAOUÅEIYÄÖ";

        // input: "Hej!" --> ["H", "e", "j", "!"]
        for(char c : input.toCharArray()){
            int index = vowels.indexOf(c);

            // om vokal är index >= 0
            // annars -1
            if(index >= 0){
                count++;
            }
        }

        return count;
    }

    public static int[] SortIntegers_BuiltIn(int[] input){
        Arrays.sort(input);

        return input;
    }

    public static int[] SortIntegers_Manual(int[] input){

        // Create a new array of same size as input
        int[] sorted = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            //  0  1  2  3
            // [x, x, x, x] <-- input
            // minsta = 4 & minsta index = 0
            // [1, 2, 3, 4] <-- sorted

            /* Find smallest value in array */
            int smallest = Integer.MAX_VALUE; // Use Integer.MAX_VALUE to represent unset value
            int smallestIndex = -1;

            for (int j = 0; j < input.length; j++) { // For every int in array

                //  0  1  2  3
                // [2, x, 1, 4]
                // minsta = 1
                // minsta index = 2

                int current = input[j];
                // Check if current is lower than smallest
                if(current < smallest){
                    // Save current (new smallest) to smallest
                    smallest = current;
                    smallestIndex = j;
                }
            }
            /* /Find smallest value in array */

            // smallest = minsta numret

            // Spara smallest & stryka det ur arrayen
            sorted[i] = smallest; // Save smallest value
            input[smallestIndex] = Integer.MAX_VALUE; // Delete smallest value in input

        }

        // Skicka tillbaka nya sorterade arrayen
        return sorted;
    }


    public static int LinearSearch(int[] arrayToSearch, int numberToSearchFor){
        // Söker: 6
        //   0  1  2  3  4  5  6 <-- INDEX
        // [ 1, 2, 3, 4, 5, 6, 200 ]

        // Loop over each number in array
        for(int i = 0; i < arrayToSearch.length; i++){

            // Save current number to a new int
            int current = arrayToSearch[i];

            // Check if current is what we are searching for
            if(current == numberToSearchFor){

                // If so, return it
                return i;
            }
        }

        return -1;
    }

    public static int BinarySearch(int[] arrayToSearch, int numberToSearchFor){
        // Söker: 6
        //   0  1  2  3  4  5  6 <-- INDEX
        // [ 1, 2, 3, 4, 5, 6, 6, 6, 6, 7 ]



        return -1;
    }
}
