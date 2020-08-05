
package day15_String;

public class substring_method {

    public static void main(String[] args) {

        String sentence ="Java is fun";
        //                0123456789...
        //substring(beg index, end index)
        String word1 = sentence.substring(0,4);// java
        System.out.println(word1);

        String word2 = sentence.substring(8,11);// fun
        System.out.println(word2);
        System.out.println("=========================");

        String sentence2 = "I like Movies and TV Series";
        String word3 = sentence2.substring(7,13);
        System.out.println(word3);
        System.out.println("=========================");

        String firstName= "cYBerTEK";
        String firstCharacter = firstName.substring(0,1);//c
        String rest = firstName.substring(1,firstName.length());//firstName.length() means lastIndex+1
        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();
        System.out.println(firstCharacter);
        System.out.println(rest);
        System.out.println(firstName);
        System.out.println("==============================");

        String lastName ="school";
        String firstChar=lastName.substring(0,1); //s
        String remaining =lastName.substring(1);//chool
        lastName = firstChar.toUpperCase() +remaining.toLowerCase();
        System.out.println(firstChar);
        System.out.println(remaining);
        System.out.println(lastName);
        System.out.println("=========================");


        String s = "I Like Game Of Thrones";
        String Series = s.substring(7);
        System.out.println(Series);


        String s2 ="I Like Java programming Language";
        String language = s2.substring(7);
        System.out.println(language);

    }
}
