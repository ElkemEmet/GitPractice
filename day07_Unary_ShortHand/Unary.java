package day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1 + -10); // -1 - 10 ==> -11

        System.out.println(-11 - 10);// -21

         // --:
        int a = 20;
       // a = a - 1;//a =19
        --a;//19
        System.out.println(a);

        // ++ :
        int b = 10;
       // b = b + 1;//11
        ++b;//11
        System.out.println(b);


        // pre:
        int x =100;
        System.out.println(++x);//101
        System.out.println(--x);//100

        int y = 200;
        System.out.println(--y);//199






    }
}
