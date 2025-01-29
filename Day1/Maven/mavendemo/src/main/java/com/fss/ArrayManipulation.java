package com.fss;
 
import java.util.Arrays;
 
public class ArrayManipulation {
 
    public static void main(String[] args) {
       
         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       
       
        int largest = arr[0];
        int smallest = arr[0];
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
       
       
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
 
       
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / (double) arr.length;
       
       
       
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
        System.out.println("Sum of Elements: " + sum);
        System.out.println("Average of Elements: " + average);
    }
 
}