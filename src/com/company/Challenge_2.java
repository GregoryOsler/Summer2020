package com.company;
//We are making a rectangle with triangles within it
//06/04/2020

public class Challenge_2 {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        Line();
//        Bottom();
        Top();
//        Bottom();
        Line();
//        Bottom();
        Top();
        Line();
    }

    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < 2 * SIZE + 1; dash++) {
            System.out.print("-");
        }
        System.out.print("+");
    }

    public static void Top() {
        for (int line = 1; line < SIZE + 1; line++) {
            System.out.print("|");
            for (int space = 1; space <= -1 * line + SIZE + 1; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= 1 * line - 1; slash++) {
                System.out.print("/");
            }
            for (int slash = 1; slash <= 1 * line - 1; slash++) {
                System.out.print("\\");
            }
            System.out.println("|");
        }
    }
}
    public static void Bottom(){

//    }


