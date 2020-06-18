package com.company;

// Import Scanner
//Write meal cost using the double
//Then use int to get tips
//use int to get tax value
//solve the sum of the 3 together
//add a method to get tip percent and total cost


import java.util.Scanner;

public class OperatorChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter meal cost: ");
        double mealCost= input.nextDouble();
        System.out.println("Enter tip value: ");
        int tipPercent= input.nextInt();
        System.out.println("Enter tax value");
        int taxValue= input.nextInt();
        solve(mealCost, tipPercent,taxValue);

    }
    public static void solve(double mealCost, int tipPercent, int taxValue){
        double tip= tipPercent * mealCost/100;
        double tax= taxValue* mealCost/100;
        int TotalCost= (int) Math.round(mealCost + tip + tax);
        System.out.println("Your total cost: "+ TotalCost);
    }
}
