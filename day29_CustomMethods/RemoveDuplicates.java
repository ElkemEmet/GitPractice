package day29_CustomMethods;

public class RemoveDuplicates {
    //10. write a method than can remove the duplicates from the string

    public static void main(String[] args) {
        String str="abbbbbababababaccccccccccccccccccccdddddddddeeee";

        removeDup(str);
    }


    public static void removeDup(String str){ //"abab"
        String nonDup="";// "ab"

        for( String each  : str.split("") ){//[a,b,a,b]
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }
             System.out.println(nonDup);

    }
}
