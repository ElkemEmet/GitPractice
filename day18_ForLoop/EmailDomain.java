package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {
   /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
    String email = scan.next();
    String domain =email.substring(email.indexOf("@")+1,email.length()-4);
        System.out.println(domain);

    */
    public static void main(String[] args) {

        String email="cybertek@gmail.com";
        int index1=email.indexOf("@");
        int index2=email.lastIndexOf(".");
        String domain = email.substring(index1+1,index2);//"gmail"

        System.out.println(domain);






    }
}
