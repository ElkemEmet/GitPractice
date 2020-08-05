package day25_Practices;
//1. Write a program that can return the shortest string of text from a String array
public class ShortestString {

    public static void main(String[] args) {

        String[] arr = {"Anam","me","Nickolas","Amir","Nurmamet","oil"};

        int minLength = arr[0].length();//4

        for(int i =0; i<=arr.length-1;i++){
            int l =arr[i].length();// 4 8 4 8
            if(l<minLength){
                minLength = l;
            }
        }

        //System.out.println(minLength);

        for(int i =0;i<=arr.length-1;i++){
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }


    }
}
