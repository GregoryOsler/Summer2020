package com.company;
import java.util.Random;
import java.util.Arrays;
public class weather {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        Random randy = new Random();
        Arrays.sort(intArray);
        for (int index = 0; index < intArray.length; index++) {

            System.out.println(intArray[index] = randy.nextInt(110 - 25) + 25);
            System.out.println("Day "+(index+1)+ " temperature= "+ intArray[index]);
            randy.nextInt();
        }
            int sum = 0;
            for(int i=0; i < intArray.length ; i++)
                sum = sum + intArray[i];
                //calculate average value
                double average = sum / intArray.length;


                System.out.println("Average value of the array elements is : " + average);
                System.out.println("The amount of numbers above the average= ");
        }
    }
