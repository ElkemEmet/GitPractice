package day34_WrapperClass;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(45);
        list.add(99);
        list.add(30);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each : list){
            if(each >max) {
                max = each;
            }
            if(each<min){
                min =each;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
