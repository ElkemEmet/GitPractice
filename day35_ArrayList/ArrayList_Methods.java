package day35_ArrayList;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdList  = new ArrayList<>();
              earlyBirdList.add("Ibrahim");
              earlyBirdList.add("Virginia");
              earlyBirdList.add("Ziiadin");
              earlyBirdList.add("Erfan");
              earlyBirdList.add("Aalia");

        earlyBirdList.set(2,"Aslan");
        earlyBirdList.set(0,"Ayhan");
       // earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println( earlyBirdList.size() );

        System.out.println("======================================");

      //remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
              list.add(1);   //0
              list.add(2);   //1
              list.add(3);   //2
              list.add(4);   //3
              list.add(5);   //4

        list.remove(2);   // remove index num array list
     // list.remove(4);   // IndexOutOfBoundsException: Index: 4, Size: 4
        list.remove(3);   // [1,2,4]

        System.out.println(list);


     //remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   //0
        list2.add(2);   //1
        list2.add(3);   //2
        list2.add(4);   //3
        list2.add(5);   //4

      //  int  a = 1;    // remove index
        Integer b = 1; // remove element

      //  list2.remove(a);
        list2.remove(b);
        System.out.println(list2);


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");  //0
        list3.add("Liliia"); //1
        list3.add("Bulnet"); //2
        list3.add("Viorel"); //3
        list3.add("Musa");  //4

        //  list3.remove(2);
        list3.remove("bulnet");
        boolean r = list3.remove("bulnet");

        System.out.println(list3);
        System.out.println(r);





    }
}
