package day16_String;

import java.util.Scanner;
// use equals and use equalsIgnoreCase

public class Practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer = scan.next();
        //String answer = scan.next().toLowerCase()  <=====> if no use equalsIgnoreCase

        if(answer.equalsIgnoreCase("yes")){//equals
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }




    }
}
