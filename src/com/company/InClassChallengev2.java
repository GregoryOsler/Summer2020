package com.company;
//This we made a mirror thing
//Gregory Osler
//06/03/2020

public class InClassChallengev2 {
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();

    }

    public static void Line() {
        System.out.print("#");
        for (int dash = 0; dash < 16; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space<=-2*line+8; space++) {
                System.out.print(" ");
            }
                System.out.println("|");
        }
    }
    public static void Bottom(){
        for(int line=1; line<=4; line++){
            System.out.print("|");
            for(int space=1; space<= 2*line-2; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line +16; dot++){
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space<=2*line-2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
