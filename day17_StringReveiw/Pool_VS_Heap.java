package day17_StringReveiw;

public class Pool_VS_Heap {

    public static void main(String[] args) {

        String s1 = "Cybertek";  //pool
        String s2 = "Cybertek";  //pool
        String s3 = new String("Cybertek");//heap
        String s4 = new String("Cybertek");//heap
        String s5 = "cybertek";//pool

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false ,different location.
        System.out.println(s5==s2);//false,different object
        System.out.println(s5==s1);//false



    }
}
