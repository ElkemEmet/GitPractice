package day07_Unary_ShortHand;

import java.util.jar.JarOutputStream;

public class Post_VS_Pre {
    public static void main(String[] args) {
         int a = 10;
        System.out.println(++a);//11    immediately happen
        System.out.println(a);//11

        System.out.println("=====================");

        int b = 10;
        System.out.println(b++);//10 no immediately happen,wait second step
        System.out.println(b);//11

        System.out.println("=========================");

        int c = 25;
        int d = c++;  // d = 25;   c = 26;
        System.out.println(d);//25
        System.out.println(c);//26

        System.out.println("=======================");

        int e = 25;
        e++;
        System.out.println(e);

       // int x = 8;
       // int y = x++;
        //System.out.println(y);

        int w =2;
        System.out.println(w++);

        System.out.println("=======================");

        int x = 8;
        int y = x--;// y = 8;
        System.out.println(y);//8
        System.out.println(x);//7


        int s =2;
        int q =++s;
        ++s;
        ++s;
        System.out.println(s);
        System.out.println(q);








    }
}
