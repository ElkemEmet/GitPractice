package day06_ComparisonOperators;

public class RelationlOperators {
    public static void main(String[] args) {
        boolean r1 = 10 >9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        boolean r4 = 877 >=878;
        System.out.println(r4);

        boolean r5 = 200<=300;
        System.out.println(r5);

        boolean r6 = 900==800;// false
        boolean r7 =true == false;
        System.out.println(r7);

        boolean r9 = "muhtar"=="MUHTAR";//false

        boolean r11 ="Muhtar" !="Bad Guy";//true

        boolean r12 = true !=false;//true

        boolean result1 = 'A'== 65;
        System.out.println(result1);

        boolean result2 =100==100.0;
        System.out.println(result2);//true

        boolean result3 = 10==(int)10.999999;
        System.out.println(result3);//true

        boolean result4 ="100" =="100.0";
        System.out.println(result4);

        int number = 100;
        boolean even = number%2 ==0;//even number
        boolean odd = number%2 !=0;
        System.out.println(even);
        System.out.println(odd);

    }



}
