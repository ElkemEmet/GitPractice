package day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores =  new ArrayList<Integer>();  //last Integer is optional
        scores.add(95); // autoBoxing     0
        scores.add(100);//                2
        scores.add(85); //                3
        scores.add(75); //                4
        scores.add(1,65);//  1
      //  scores.add(7,55);// outOfBounds,because index7 is wrong


        System.out.println( scores );

        // 100;
        System.out.println( scores.get(2) );

        System.out.println(scores.size());






    }
}
