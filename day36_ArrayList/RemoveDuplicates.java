package day36_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('B');
        list.add('C');
        list.add('C');
        list.add('D');

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();

        for (Character each :list) { //'A','A','B','B','C','C'
            if(!nonDup.contains(each)){
                nonDup.add(each);

            }
        }

        System.out.println(nonDup);

    }
}