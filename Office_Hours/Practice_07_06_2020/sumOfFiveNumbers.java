package Office_Hours.Practice_07_06_2020;

// 2. write a program that can ask the user enter a number for five times
// and the returns the sum of those five numbers

import java.util.Scanner;

public class sumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 10;i <= 50; i+=10){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            sum+= num;
        }

        System.out.println(sum);






    }
}
