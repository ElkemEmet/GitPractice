package day25_Practices;
//  Write a program that can return the longest string of text from a String array
public class LongestString {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};


        int maxLength = arr[0].length(); //4

        for( String each : arr ) {
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }

        System.out.println(maxLength);

        for(String each: arr ){
            if(each.length() == maxLength){
                System.out.println(each);
            }
        }







    }
}