package com.company;
import java.util.Scanner;
public class GangstaName {
    public static void main(String[] args){
//    String Gdid= new String("G. diddy ");
//      String O= new String("OSLER ");
//          String fn= new String("Gregory-izzle");
//    System.out.print(Gdid);
//        System.out.print(O);
//        System.out.print(fn);
        Scanner console= new Scanner(System.in);
        System.out.print("Type your name here: ");
        String name = console.nextLine();
        int indexOf= name.indexOf(" ");
        String first= name.substring(0, indexOf);
String last= name.substring(name.indexOf(" ")+1);
last= last.toUpperCase();
char fInitial= first.charAt(0);
System.out.println("your gangsta name is\"" + fInitial+ ". Diddy "+ last+ " "+ first+ "-izzle\"");
}
}