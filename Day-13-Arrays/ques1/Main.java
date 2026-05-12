/*
A.	Write a Java program that initializes an array of integers and fills it with random values between 1 and 100. Perform the following operations:
●	Find the maximum and minimum value in the array.
●	Calculate the average of the values in the array.
●	Sort the array using the Arrays.sort() method and print the sorted array.
*/

package ques1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 100;

        // array of 100 random integers
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(minVal(arr));

        System.out.println(maxVal(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int minVal(int[] arr) {
        int min = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < min)
                min = arr[i];
            i++;
        }

        return min;
    }

    public static int maxVal(int[] arr) {
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > max)
                max = arr[i];
            i++;
        }
        return max;
    }

    public static int average(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

}
