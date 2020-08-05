package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));


        String[] names ={"Muhtar","Saim","Nadir","Asiye","Kuzzat"};

        System.out.println(names);//in order to print array variable we MUST convert in to string

        System.out.println( Arrays.toString(names) );

        System.out.println("===============================");

        int[] nums = {5,4,6,5,10,3,4};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);//[3,4,4,5,5,6,10]// for max and min first step is MUST SORT

        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number is: "+nums[nums.length-1]);
        System.out.println("Minimum number is: "+nums[0]);

        String students[] = {"Mehdi","Elkem","Meee","Trump"};

        Arrays.sort(students);

        System.out.println( Arrays.toString(students) );

        System.out.println("======================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

















    }
}
