package com.company;

import java.util.Scanner;

//import Math class
import java.lang.Math;

        public class BMI_Practice {

            public static void main(String[] args) {

                //create scanner
                Scanner input = new Scanner(System.in);

                //declare variables
                double weight;
                int inches;

                //prompt user
                System.out.print("Enter person 1's weight in pounds: ");
                weight = input.nextFloat();


                System.out.print("Enter inches: ");
                inches = input.nextInt();

                //convert measurements
                double bmi = weight / Math.pow(inches,2)* 703;
//      double bmi = weightInKilos / (heightInMeters * heightInMeters);

                //display output
                System.out.println("Your BMI is: " + bmi);

                //interpret BMI
                if (bmi < 18.5 ) {
                    System.out.println("Underweight");
                }

                else if (bmi >= 18.5 && bmi < 25) {
                    System.out.println("Normal");
                }

                else if (bmi >= 25 && bmi < 30) {
                    System.out.println("Overweight");
                }

                else if (bmi >= 30) {
                    System.out.println("Obese");
                }

                System.out.print("Enter person 2's weight in pounds: ");
                weight = input.nextFloat();


                System.out.print("Enter inches: ");
                inches = input.nextInt();

                double weight2 = weight * 0.453592;
                double heightInMeters1 = ((inches) * .0254);
                double bmi2 = weight2 / Math.pow(heightInMeters1, 2.0);

                //display output
                System.out.println("Your BMI is: " + bmi);

                //interpret BMI
                if (bmi < 18.5 ) {
                    System.out.println("Underweight");
                }

                else if (bmi >= 18.5 && bmi < 25) {
                    System.out.println("Normal");
                }

                else if (bmi >= 25 && bmi < 30) {
                    System.out.println("Overweight");
                }

                else if (bmi >= 30) {
                    System.out.println("Obese");
                }
                input.close();

            }

        }

