package day12_Switch_Scanner;

public class Switch_Practice1 {

    public static void main(String[] args) {

        int num = 4;

        switch(num){  //  switch only use for data type, "if else" use for boolean.
            case 1 :
                System.out.println("Monday");   // also use String result =""; result ="Monday";
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");


        }

        //System.out.println(result);

    }
}
