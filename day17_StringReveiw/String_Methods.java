package day17_StringReveiw;

public class String_Methods {

// practice all String methods

    public static void main(String[] args) {
        //charAt(index); ==> return char
        String str = "Cybertek";
        //           01234.....

        char ch1 = str.charAt(1);
        System.out.println(ch1);//y
        System.out.println("======================");

        // +:
        String str2 = "Cybertek";
               str2 = str2 + " school";
        System.out.println(str2);  // Cybertek school
        System.out.println("======================");

        //length():==> return int
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println(l);//8
        //lastindex:length -1;

        char ch2 = str3.charAt(l-l);//==str3.length()-1
        System.out.println(ch2);//C
        System.out.println("last index : "+(l-1));
        System.out.println("=========================");

        //Uppercase & Lowercase
        String str4 = "cybertek";
        str4 = str4.toUpperCase();
        System.out.println(str4);//CYBERTEK
        String str5="JAVA";
        str5 = str5.toLowerCase();
        System.out.println(str5);//cybertek
        System.out.println("=========================");

        //trim():remove unused space
        String str6 = "     cybertek    school   ";//between the word spaces can not be remove.
        System.out.println(str6);//    cybertek    school
        str6 = str6.trim();
        System.out.println(str6);//cybertek    school
        System.out.println("=========================");

        //substring:
        String str7 = "I Like Java Language";
        //             012345678910
        String word = str7.substring(7,11);//if want keep "I Like Java Language",use new "word" variable.
        //str7 = str7.substring(7,11);//Java, last variable is gone,
        System.out.println(word);//Java

        String word2 = str7.substring(12,str7.length());
        String word3 = str7.substring(12);
        System.out.println(word2);//Language
        System.out.println(word3);//Language
        String word4 = str7.substring(2,6);
        System.out.println(word4);//Like
        System.out.println("=========================");

        //indexOf & lastIndexOf ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);//23
        System.out.println(str8.charAt(i1));//W
        int i2 = str8.indexOf(", W")+2;
        int i3 = str8.indexOf("We");//
        System.out.println(i2);//38
        System.out.println(i3);//38

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        System.out.println(i4);//10
        int i5 = str9.indexOf("J");
        System.out.println(i5);//0
        int i6 = str9.indexOf(" Java ")+1;
        System.out.println(i6);//5
        int i7 = str9.lastIndexOf("Java ");//5
        System.out.println(i7);
        System.out.println("=========================");

        //replace & replaceFirst
        String s1 = "I Like Java, Java is programming language";
        s1 = s1.replace("Java","C#");
        System.out.println(s1);//I Like C#, C# is programming language.

        String s2 = "I Like Java, Java is programming language";
        s2 = s2.replaceFirst("Java","C#");
        System.out.println(s2);

        String s3 = "I Like Java, Java is programming language";
        s3 = s3.replace("Java is","C# is");
        System.out.println(s3);











    }

}
