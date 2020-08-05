package day14_Recap;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int num = input.nextInt();
       // double num = input.nextDouble();
       // boolean num = input.nextBoolean();// whenever use boolean only enter true or false.
        System.out.println("Do you want to learn Java?");
        //String num = input.next();// use one word answer, YES or NO.
        String num = input.nextLine();

        System.out.println("You have entered "+num);
    }
}
