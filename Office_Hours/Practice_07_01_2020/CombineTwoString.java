package Office_Hours.Practice_07_01_2020;
import java.util.Scanner;
/*1. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same,
print that character once.
        Input:
        one
        eight
        Output:
        oneight

 */

  /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = scan.next();
        System.out.println("Enter second word");
        String str2 = scan.next();
       // System.out.println(str1+str2);

        char ch1 = str1.charAt(str1.length()-1);// last character of the first word
        char ch2 = str2.charAt(0);//first character of the second word
        if(ch1==ch2){
        System.out.print(str1+str2.substring(1));
        }

   */
public class CombineTwoString {
    public static void main(String[] args) {
     /*   String str1 = "One";
        String str2 = "eight";

     /*   char ch1 = str1.charAt(str1.length()-1);//last char from str1
        char ch2 = str2.charAt(0);//first char from str2

        if(ch1==ch2){
            System.out.println(str1+str2.substring(1));//excluding the first character of the second
        }else {
            System.out.println(str1+str2);
        }
*/

       /*  String s1 = str1.substring(str1.length()-1);
              // str1.substring(str1.length()-1,str1.length());
                     //substring(  2             ,      3)===> e
         String s2 = str2.substring(0,1);// "e"

        if(s1.equals(s2)){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }


*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = scan.next();
        System.out.println("Enter second word");
        String str2 = scan.next();

        char ch1 = str1.charAt(str1.length()-1);// last character of the first word
        char ch2 = str2.charAt(0);//first character of the second word
        if(ch1==ch2){
            System.out.print(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }


    }
}
