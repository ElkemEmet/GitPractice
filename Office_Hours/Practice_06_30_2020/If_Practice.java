package Office_Hours.Practice_06_30_2020;

public class If_Practice {
    public static void main(String[] args) {

        int num = 305;
        String  result="";

        if(num % 2 == 0){
            result=num+ " is even number";
        } else {
            result=num+ " is  odd number";
       }
        System.out.println(result);

        String result2= (num % 2 == 0)  ?  num+ " is even number" : num+ " is  odd number";
        System.out.println(result2);



    }
}
