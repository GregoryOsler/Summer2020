package com.company;
//Gregory Osler
//06/26/2020
//Pseudocode:
//We initially imported the necessary imports (fileimport java.io.File;import java.io.FileNotFoundException; import java.util.*)
//We the made public variables that we would use throughout the code using public static
//We only put 2 things in our main: Ask and Ask 2
//Ask was only for the first time asking: if one said yes, it would send the user through an if loop giving the rules. If one said no, it would say goodbye
//In the code I put if it contains "es" so the program can avoid any spelling
//We gave the rules by using system.out.println
//Ask 2 was where all the games were
//If the user said yes, it would take him or her to Ask 2: the section where the file that was processed from another document
//We declared file and declared scanners to scan the file and the user's choice
//After the user says yes, the program will ask a following question: "Would you like to play the Integer game, Doubles game, or the Sports game?(Integers, Doubles, or Sports): "
//The user will type a game and the program will activate scanner scan and scan the answer to see which to use
//We then set it up with if loops the if loop basically states if user's choice contains Sports, Doubles, or Integers
//If sports, it will system.out.println telling the user to guess a sports team
//We set up a while loop inside to scan the txt program for the guess
//If correct, the program will give him or her a point (using an if loop)
//If correct, the else loop will activate giving the user +0 points
//Correct or wrong, the program will still add a +=1
//I also set up Sports Integer and Doubles to activate if it has rts ger or les just for less space for spelling errors
//If integers, it will system.out.println telling the user to guess an integer
//We set up a while loop inside to scan the txt program for the guess
//If correct, the program will give the user a point (using an if loop)
//If correct, the else loop will activate giving the user +0 points
//Correct or wrong, the program will still add a +=1
//If a double, it will system.out.println telling the user to guess a double
//We set up a while loop inside to scan the txt program for the guess
//If correct, the program will give the user a point (using an if loop)
//If correct, the else loop will activate giving the user +0 points
//Correct or wrong, the program will still add a +=1
//After every section (int, sports, doubles) there is an offer to play again and a scanner to scan if the user said Yes or No
//If the user says yes, it will loop him or her back to the beginning of Ask2
//If the user says no, it will give the user the score and says goodbye
//Ask2 will go for as long as the user continues to put Yes to the play again question

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FinalWordProject {
    public static String stringfile;
    public static String yesorno;
    public static int points = 0;
    public static int tries = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Ask();
        Ask2();

    }

    public static void Ask() {//uses this method only for first time saying yes or no
        System.out.println("Would you like to play the game?(Yes or No): ");
        Scanner scanAsk = new Scanner(System.in);
        yesorno = scanAsk.next();
        if (yesorno.contains("es")) {
            System.out.println("Great you have chosen to play the game!");
            System.out.println("There are three categories which you will be asked about.");
            System.out.println("The three categories are sports teams, doubles between 0 and 50, and integers between 1 and 100.");
            //rules
            System.out.println("To score a point you need to guess a team or number correctly.");
            System.out.println("This total will be printed when you choose to stop playing.");
            System.out.println("_____________________________________________________");


        }


    }

    public static void Ask2() throws FileNotFoundException { //how all the games run
        File file = new File("/Users/gregoryosler/IdeaProjects/Summer2020/src/com/company/WordGame");
        Scanner scanfile = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        if (yesorno.contains("es")) {
            System.out.println("Would you like to play the Integer game, Doubles game, or the Sports game?(Integers, Doubles, or Sports): ");
            String userChoice = scan.next();
//sports teams
            if (userChoice.contains("rt")) {
                System.out.println("The topic chosen is: Sports!");
                System.out.println("Please choose any sports team");
                String userBaseballanswer = scan.next();
                // points/scoring system
                int temp = points;//sets them equal for the sake of the telling if u got it right
                while (scanfile.hasNextLine()) {
                    String stringfile = scanfile.nextLine();//this string runs over the whole program while there are still more lines
                    if (stringfile.contains(userBaseballanswer)) {//if the txt contains the answer the user gives, this runs
                        points += 1;//adds 1 point if correct
                    }
                }
                if (points-1== temp) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points-1>temp){
                    System.out.println("Wow you found a bonus points number. Great Job!");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points==temp) {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                System.out.println("Would you like to play again?:");
                String yesornov2 = scan.next();
                if (yesornov2.contains("es")) {
                    Ask2();
                } else {
                    System.out.println("You finished with " + points + " points.");
                    System.out.println("Thanks for playing.");
                    double avg= points/tries;
                    System.out.println("You scored a " +avg+ "percent");

                }
            }
//Integers
            if (userChoice.contains("ger")) {
                System.out.println("The topic chosen is: Integers(Between 1 and 100)!");
                System.out.println("Please choose any integer");
                String userNumberanswer = scan.next();
                // points/scoring system
                int temp2 = points;
                while (scanfile.hasNextLine()) {
                    String stringfile = scanfile.nextLine();
                    if (stringfile.contains(userNumberanswer)) {
                        points += 1;
                    }
                }
                if (points > temp2) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries +=1;
                } else {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries +=1;
                }
                System.out.println("Would you like to play again?:");
                String yesornov3 = scan.next();
                if (yesornov3.contains("es")) {
                    Ask2();
                } else {
                    System.out.println("You finished with " + points + " points. Out of " + tries);
                    double avg= points/tries;
                    System.out.println("You scored a " +avg+ " percent");
                    System.out.println("Thanks for playing.");
                }

            }
            //Doubles
            if (userChoice.contains("ble")) {
                System.out.println("The topic chosen is: Doubles(Between 1.0 and 50.0)!");
                System.out.println("Please choose any double");
                String userDoubleanswer = scan.next();
                // points/scoring system
                int temp3 = points;//sets them equal for the sake of the telling if u got it right
                while (scanfile.hasNextLine()) {
                    String stringfile = scanfile.nextLine();//this string runs over the whole program while there are still more lines
                    if (stringfile.contains(userDoubleanswer)) {//if the txt contains the answer the user gives, this runs
                        points += 1;//adds 1 point if correct
                    }
                }
                if (points-1== temp3) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points-1>temp3){
                    System.out.println("Wow you found a bonus points number. Great Job!");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points==temp3) {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                System.out.println("Would you like to play again?:");
                String yesornov4 = scan.next();
                if (yesornov4.contains("es")) {
                    Ask2();
                }
            else{
                System.out.println("You finished with "+ points +" points. Out of "+ tries+ " times");
                System.out.println("Thanks for playing!");
                }
            }
        }
        else {
            System.out.println("Your score is: " + points+ " You had " +tries+ " attempts");//points will be declared
            System.out.println("Goodbye");
        }
        scanfile.close();
    }
}