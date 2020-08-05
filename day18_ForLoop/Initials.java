package day18_ForLoop;

import java.util.Scanner;

/*2. write a program that asks user's first and last name, then prints out the initials of the user

        input:
        cybertek
        batch18
        output:
        your initial is: CB
        DO NOT use charAt method

 */
public class Initials {
    public static void main(String[] args) {
      /*
       //first solution:
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String firstName = str1.substring(0,1).toUpperCase();
        String secondName = str2.substring(0,1).toUpperCase();
        System.out.println("your initial is:"+firstName+secondName);
        System.out.println("===========================================");

        //second solution
        String firstName = "Cybertek";
        String lastName = "School";
        String initial =  firstName.substring(0,1)+lastName.substring(0,1);
        initial = initial.toUpperCase();
        System.out.println(initial);
        System.out.println("===========================================");
         */
      //third solution
        String firstName = "Cybertek";
        String lastName = "School";
        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        String initial =  "" + ch1 + ch2 ;//must concating String,becuase two char is here.
        initial = initial.toUpperCase();// always assign back
        System.out.println(initial);



    }

}
