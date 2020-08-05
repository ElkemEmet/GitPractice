package day20_WhileLoops;

import java.util.Scanner;

/*3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan =new  Scanner(System.in);
        String str = scan.nextLine();  //"ab"
        //            0123

        String result = ""; // "abcdefghi"

        /*
        for(int i = 0; i <= str.length()-1; i++  ){
              String s =  ""+str.charAt(i); // a, a, b, b
                if( result.contains(s) ){
                   continue;
                }
                result += s;
        }
    */

        for(int i = 0; i <= str.length()-1; i++  ){

            //  String s =  ""+str.charAt(i);  //a,  b,  a,  b
            String s = str.substring(i, i+1);

            if( !result.contains(s) ){ // if the character is already contained in result, wre will not add it again
                result += s;
            }

        }

        System.out.println(result);

    }

}