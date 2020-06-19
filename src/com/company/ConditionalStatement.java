package com.company;
//Gregory Osler
//06/19/2020

import java.util.Scanner;

//Pseudocode:
//Declare the int as any number
//if the int is odd print Weird, if even print Not Weird
//if the int is even and in the range of 6-20 put weird
//if the int is greater than 20 put Not Weird
//^^^ all if else statements
public class ConditionalStatement {
    public static void main(String[] args) {
//        int int1=
//
//        Scanner console= new Scanner(System.in);
//        System.out.println("Type your integer: ");
//        int1= console.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play the game(Yes or No): ");
        String play = input.next();
        input.nextLine();
        while (play.contains("Yes")){
            playGame(input);   //this is how you call a method
            System.out.print("Do you want to play the game(Yes or No): ");
            play= input.next();
        }
        System.out.println("Goodbye");
    }
    public static void playGame(Scanner input) {
        System.out.println("Type a number between 1-137");
        int n = input.nextInt();
        if (n < 1 || n > 137) {
        System.out.println("Run again and type in a number between 1 and 137");
        playGame(input);
    }
        else if (n % 2 !=0) {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }


    }

    }

