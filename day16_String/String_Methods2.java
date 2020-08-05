package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {
        //isEmpty();
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());//false

        String name2 ="";
        System.out.println(name2.isEmpty());//true
        System.out.println("===========================");

        //equals()
        // equalsIgnoreCase
        String str1 ="Java";  // pool
        String str2 = new String("Java");//heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);  //false
        System.out.println(str1.equals(str2));//true : check if the string has same text with the given string.returns boolean

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3==str4);//false,because they are 2 different abject(new).
        System.out.println(str3.equals(str4));//true,because equals method just compare the  text"JAVA" so is true.

        String str5 ="Java";
        String str6 ="Java";
        System.out.println(str5==str6);//true,just one object created string pool and  one object sharing by 2 variable.
        System.out.println(str5.equals(str6));//true

        String str7="JAVA";
        String str8="java";
        System.out.println(str7.equals(str8));//false
        System.out.println(str7.equalsIgnoreCase(str8));//true
        System.out.println("========================================");

        //contains:
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python"));//false
        System.out.println(!str.contains("python"));//true
        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("JAVA"));//false
        System.out.println("========================================");

        //startWith():
        String s1 = "Muhtar";// check if the string is started with the given str.returns boolean.
        System.out.println(s1.startsWith("M"));//true
        System.out.println(s1.startsWith("J"));//false
        System.out.println(s1.startsWith("Mu"));//true
        System.out.println(s1.toLowerCase().startsWith("mu"));//true

        //endWith();
        //checks if the string is ended with the given str. returns boolean.





















    }
}
