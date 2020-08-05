package day29_CustomMethods;

import Office_Hours.Practice_07_14_2020.Unique;

public class UniqueElements {

    public static void main(String[] args) {
        String[] arr={"A","B","B","C"};
        uniques(arr);

        System.out.println("Hello");

        String[] arr2 = {"D","D","E","F","F"};
        uniques(arr2);
    }


    public static void uniques(String[] arr){

       for(String a :arr){  // to get each of the elements
           int count = 0;
           for(String  each: arr ){ //  to get frequency of the element
               if( a.equals(each) ){
                   count++;
               }
           }
           if(count ==1){ //unique
               System.out.print(a+" ");
           }
       }

       System.out.println(); // for starting from new line
   }

}
