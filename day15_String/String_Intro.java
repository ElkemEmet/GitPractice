package day15_String;


public class String_Intro {
    public static void main(String[] args) {

        String str = "Cybertek";
       // Scanner input = new Scanner(System.in);

        String name = "Cybertek";
        String name2 = new String ("Cybertek");

        String s1="Cat";//String literal==>String pool
        String s2="Cat";//String literal==>String pool
        System.out.println(s1==s2);//true

        String d1="Dog";//String literal==>String pool
        String d2="Dog";//String literal==>String pool
        System.out.println(d1==d2);//true

        System.out.println("=====================");

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1==t2);//false
        // new String("Tiger)==new String("Tiger)===>false

        System.out.println("============================");

        String c1="Cybertek";     //String pool
        String c2= new String("Cybertek"); // java heap
        String c3= new String("Cybertek"); // java heap
        String c4="Cybertek";//String pool
        String c5="cybertek";// String pool

        System.out.println(c1 == c2);// false different location and two different object
                                        //"Cybertek" == new String(System.in);==different object

        System.out.println(c2==c3);//false

        System.out.println(c1==c4);//true

        System.out.println(c4==c5);//false

    }

}
