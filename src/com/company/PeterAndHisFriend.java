package com.company;
import java.util.Scanner;
//firstWord = Peter
//phrase= and his friend
public class PeterAndHisFriend {
    public static int indexOf;
    public static String firstword;
    public static char letter;
    public static String secondword;
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf+1);// "Peter "
        // phrase = phrase - firstword
        char letter;
        int count = 0;
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = firstword.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                firstword= firstword.replace(letter, ' ');
//                secondword= phrase.substring(1,' ');
                // find the rest of the letter of your message maybe use a method??
                phrase= phrase.replace(firstword, " ");


                //  replace the letter you just finished in the firstword with a ' '

                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }

}
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        System.out.print("Type in a phrase");
//        String fullphrase = console.nextLine();
//        int index = fullphrase(" ");
//        String firstWord = fullphrase.substring(0, index);
//        char letter;
//        int count = 0;
//        for (int i = 0; i < firstWord.length(); i++) ;
//        {
//
//            letter = firstWord.charAt(i);
//            count++;
//            System.out.println(letter + "     " + count);
//            index = firstWord.indexOf(firstWord.substring(index));
//
//
//            count = 0;
//
////            char letter;
////            int count=0
////            for(int i= 0; i< firstWord.length(); i++);
////            letter= firstWord.charAt(i);
////            count++
//////                    find the rest
////            System.out.println(letter, count);
////            count=0
//        }
//    }
//




