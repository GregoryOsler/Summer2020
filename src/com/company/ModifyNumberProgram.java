package com.company;

public class ModifyNumberProgram {

        public static void main(String[] args) {
            int Sub= 38+40+30;
            double tax= Sub*.08;
            double tip= Sub*.15;

            // Calculate total owed, assuming 8% tax / 15% tip

            System.out.println("Subtotal: "+Sub);

            System.out.println("Tax: "+tax);

            System.out.println("Tip: "+tip);

            System.out.println("Total: "+ (Sub+tax+tip));



        }

    }
