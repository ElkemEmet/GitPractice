package day12_Switch_Scanner;

import java.util.Scanner;
//import java.util.*;       // imports every thing from java util

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        //  int num1 = input.nextInt();    //nextInt only for integer
        // long num2 = input.nextLong();
         double num3 = input.nextDouble();

         System.out.println("You entered: " + num3);



    }
}
