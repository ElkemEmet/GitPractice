package day15_String;


public class String_Methods {
    public static void main(String[] args) {
        String name ="Cybertek School is a great place";
        //            01234567

        //charAt(index):
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch1);//c
        System.out.println(ch2);//t
        System.out.println("===================");

        //length
        int l =name.length();
        System.out.println(l);//32
        System.out.println("===================");

        //last index: length of String -1
        int lastIndexNumber = name.length() -1;
        System.out.println(lastIndexNumber);//31
        System.out.println("===================");

        //last char:
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);//e
        System.out.println("=======================");

        //concat(Str):
        // concatenation just for concat String,return new String.
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");
        //only concat string and must assign back ==>(schoolName==)
        System.out.println(schoolName);//"Cybertek School"
        System.out.println("===============================");

        //toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
               name1 =  name1.toLowerCase(); //"cybertek school"
        System.out.println(name1);
        System.out.println("=========================");

        //toUpperCase():
        String name2 = "cybertek school";
               name2 =  name2.toUpperCase();
        System.out.println(name2);
        System.out.println("==========================");

        //trim():==>moving unused spaces
        String p = "  cybertek    school    ";
               p = p.trim();
        System.out.println(p);





















    }
}
