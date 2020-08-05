package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(30,20,56,78,98,100,-1,-3,400,500,5000) );

        //maximum number:
        int max = Collections.max(list);
        //minimum number:
        int min = Collections.min(list);

        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);

        System.out.println("==================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(  Arrays.asList("Ramazan","Islem","Muhtar","Saim","Muhtar","Asiye")  );

        //replaceAll
        Collections.replaceAll(names,"Muhtar","Fatime");

        System.out.println(names);
























    }
}
