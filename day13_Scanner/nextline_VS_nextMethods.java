package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);//120000Enter--->Enter
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();//120000
        scan.nextLine();// use this to take out the Enter are left in the scanner.
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();//Enter when .

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);

    }
}
