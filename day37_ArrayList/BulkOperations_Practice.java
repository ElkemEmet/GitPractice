package day37_ArrayList;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students =  new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        // verify than the names Ulku,Busra are contained in students list
        boolean r1 =  students.containsAll(Arrays.asList("Ulku","Bursa","Muhtar"));
        System.out.println(r1);

        System.out.println("============================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
        boolean r5 = group1.addAll(Arrays.asList( "Muhtar","Nadir","Asiya","Saim")  );

        //verify your mentor and one of your closest friends names are contained in the list
        boolean r2 = group1.containsAll(Arrays.asList("Murodil","Kuzzat"));

        System.out.println(r5);
        System.out.println(r2);

        System.out.println("==========================================");

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmed","muhtar","Ahmed","Elkem"));
        System.out.println(employeeName);

        //employeeName.retainAll(Arrays.asList("Ahmed"));
        employeeName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);




    }
}
