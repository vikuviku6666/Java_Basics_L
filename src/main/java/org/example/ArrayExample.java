package org.example;

import java.util.Arrays;

public class ArrayExample
{
    static int findWithBinarySearch(int[] arr, int value){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, value);
    }
    public static void main(String[] args)
    {
        int[] numbers = {14, 16, 3, 7, 19, 13, 15, 6, 22, 66, 33};
        int valueToFind = 19;
        int resultIndex = findWithBinarySearch(numbers, valueToFind);

        System.out.println("Sorted array:  " + Arrays.toString(numbers));

        if (resultIndex >= 0){
            System.out.println("ok summary");
        } else {
            System.out.println("failed summery");
        }

    }
}
