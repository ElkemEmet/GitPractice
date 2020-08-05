package day11_NestedIf_Ternary;

public class Teranry {
    public static void main(String[] args) {
        int num =100;
        String result="";
        if(num %2 ==0){
            result ="Even";
        }else{
            result ="Odd";
        }
        System.out.println(result);
        System.out.println("======================");

      String result2 =  (num %2==0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("=======================");

        int num1 = 1000;
        int num2 = 20;

        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        System.out.println(max1);


        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("===========================");

        int age = 20;
        boolean eligibel =false;

        if(age>21){
            eligibel = true;
        }else{
            eligibel = false;
        }

        System.out.println(eligibel);

        boolean eligibel2 = (age>21) ? true : false;
        System.out.println(eligibel2);

        System.out.println("===============================");

        int age1=15;
        boolean canVote = true;

        if(age1>=18){
            canVote=true;
        }else{
            canVote= false;
        }
        System.out.println(canVote);

        boolean canVote2 = (age1 >18)?true:false;
        System.out.println(canVote2);



























    }
}
