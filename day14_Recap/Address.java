package day14_Recap;
import java.util.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state: ");
        String stateName= scan.next();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();


        /* ship to:
        Jimmy joe
        7925 Jones Branch Dr
        MClean ,VA 222102

         */
        System.out.println("\nShip TO: "+fullName+"\n"+
                buildingNumber+" "+streetAddress+"\n"+cityName+" ,"+stateName+" "+zipCode);





    }
}
