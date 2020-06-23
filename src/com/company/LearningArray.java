package com.company;
import java.util.Random;
import java.util.Arrays;
public class LearningArray {
    public static void main(String[] args) {
        int[] intArray = new int[100];
        Random randy = new Random();
//        for loop creating array
        for (int index = 0; index < intArray.length; index++) {

            System.out.println(intArray[index] = randy.nextInt(1000) + 1);
//
        }
        Arrays.sort(intArray);
        for (int index = 0; index < intArray.length; index++) {

            System.out.println(intArray[index]);
        }
        int num = Arrays.binarySearch(intArray, 4);
        if (num >= 0) {
            System.out.println(num + " is in the array");
        } else {
            System.out.println("The number is not in the array");
        }
    }
}

