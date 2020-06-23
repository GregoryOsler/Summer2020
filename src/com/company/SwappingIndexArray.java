package com.company;
//Gregory Osler
//06/23/2020
//Declared our random variable (randy)
//we then declared int size which became what the range of random numbers could be (5 to 10)
//then we put in what shows how many random numbers you'll get
//we declared an Array making sure it would stay within the int of "size"
//we then created a method that would print and swap the numbers
//we called all the variables and printed out the array
//we then used swap the variables to switch around
//we then return it all back to the main method
import java.util.Arrays;
import java.util.*;
public class SwappingIndexArray {
    public static void main(String[] args) {
        Random randy= new Random();
        int size= randy.nextInt (5)+5;
        System.out.println("you have "+ size+ " random numbers");
        int [] a1= new int [size];
        for(int i= 0; i<size; i++) {
            a1[i] = randy.nextInt(100);
        }
            int b;
            int c;
            do{
        b=randy.nextInt(size);
        c=randy.nextInt(size);
        }while (b==c);

        System.out.println(Arrays.toString(a1));
//        make these 2 random index numbers i and j

       int[] swapvar= swap(a1, b, c);
        System.out.println(Arrays.toString(swapvar));

    }
    public static int [] swap (int[] a1, int i, int j){

            int temp = a1[i];
            a1[i] = a1[j];
            a1[j] = temp;

        return a1;
    }
    }

