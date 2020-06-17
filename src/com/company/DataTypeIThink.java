package com.company;
//Gregory Osler
//06/16/2020

//Pseudocode:
//Declare my 2 integers, doubles, and strings
//I then will set up my scanner
//Then set up what the calculations will be
//Then I will put in the code for the person to type things into the text box

//I wrote my pseudocode after creating the code because I forgot to do it before (Sorry)


import java.util.Scanner;
public class DataTypeIThink {
    public static void main(String[] args) {
        int int1;
        double dub;
        String str;

        int i = 6;
        double d = 5.45;
        String s= "Greenhill";

        Scanner console= new Scanner(System.in);
        System.out.println("Type your integer: ");
        int1= console.nextInt();
        System.out.println("Enter your number with a decimal: ");
        dub= console.nextDouble();
        console= new Scanner(System.in);
        System.out.println("Enter your phrase:");
        str= console.nextLine();

        int calc1= int1+ i;
        double calc2= dub+ d;
        String calc3= (str+ " "+ s);

        System.out.printf("Integer= \n %10d", calc1);
        System.out.println();
        System.out.printf("Double= \n%10.1f", calc2);
        System.out.println();
        System.out.println("String= \n"+ calc3);

    }
}
