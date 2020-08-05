package day11_NestedIf_Ternary;

public class Teranry_Practice1 {

    //"can vote" or "Cannot vote"
    public static void main(String[] args) {

        int age =11;
        String citizen = "USA";

        String result ="";

        if(age>18 && citizen=="USA"){
            result ="Can Vote";
        }else{
            result="Can not vote";
        }

        System.out.println(result);

        String result2 =(age>18 && citizen=="USA") ? "Can Vote":"Can not vote";
        System.out.println(result2);

        System.out.println("=============================================");

        //task :equal or not equal
        int n1 =200;
        int n2= 200;

        String r = (n1==n2) ? "Equal" : "Not Equal";
        System.out.println(r);






















    }
}
