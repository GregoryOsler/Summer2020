package com.company;

public class DataTypeIThink {
    public static void main(String[] args) {
        double dub1 = 5.45;
        double dub2 = 6.99;
        double dub3 = 8.43;

        double calc1 = dub1 * dub2;
        double calc2 = Math.pow(dub2, dub3);
        double calc3 = dub1 + dub3;
        System.out.printf(" This is my calculation \n %10.3f \n %16.3f \n %10.3f", calc1, calc2, calc3);
    }
}
