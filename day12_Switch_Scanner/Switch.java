package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        int a = 10;

        switch (a){

            case 5:
                System.out.println("five");
                break; // break it is not error and not mandatory is give.but is logical error.
            case 1:
                System.out.println("one");
                break;
            default:     // default can be placed at any line. not mandatory.
               System.out.println("Invalid Case");
                break;
        }


    }
}
