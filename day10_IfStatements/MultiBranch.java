package day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 100;

        if (number > 0) {

        }
        if (number < 0) {

        }
        if(number==0) {
        }

        System.out.println("===============================");

        if(number>0){
            System.out.println(number+" is positive");
        }else if(number<0){
            System.out.println(number+" is nagetive");
        } else {
            System.out.println("number is zero");
        }
     }
    }
