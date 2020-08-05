package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;

        //a = a * a ;
        a*=a;

        System.out.println(a);

        int b =2;
        b*=3;
        System.out.println(b);

        int c = 300;
        c -=100;
        System.out.println(c);

        System.out.println("=============================");

        // +=;

        int z = 300;
        z += 200;   //z = z + 200;
        System.out.println(z);

        String  schoolName = "Cybertek";
        schoolName +=" school";
        System.out.println(schoolName);


        String fullName = "Donald";
        fullName += " Trump";
        System.out.println(fullName);

        int q =600;
        System.out.println(q/2);

        int x = 100;
        x /=2;
        System.out.println(x);//50
        x *=2;
        System.out.println(x);//100















    }
}
