package day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter your age");//38+Enter
        int age = input.nextInt();

        input.nextLine();//stop Enter

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println(fullName+" is "+age+" years old");



    }
}
