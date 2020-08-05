package day12_Switch_Scanner;
import java.util.Scanner;
//write a program that can ask user to enter two number, and the prints the sum of those two number
//            Enter your first number
//            10
//            Enter your second number
//            20
public class SumOfTwoNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        int sum = num1+num2;
        System.out.println("Sum of those two number are: "+sum);
    }
}







