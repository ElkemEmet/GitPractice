package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        //replace
        String email = "cybertek@gmail.com";
        email = email.replace("gmail","yahoo");
        System.out.println(email);//cybertek@yahoo.com

        String word ="java";
        word = word.replace("a","e");
        System.out.println(word);//jeve


        String  sentence="I like to lear Java, Java is cool, Java is fun";
        sentence  =  sentence.replace("a, Java","a, C#");
        sentence  =  sentence.replace("Java ","Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";//MIT
        s1  =  s1.replace("Cybertek","MIT");
        System.out.println(s1);
        s1  =  s1.replace("MIT","Cybertek");
        System.out.println(s1);

        String s2="I like to leaRn Java, we aRe enjoying Java";
        s2  =  s2.replace("aRe","are");//I like to learn Java
        System.out.println(s2);
        System.out.println("======================================================");

        //replaceFirst
        String s3 = "I like to drink tea and tea";
               s3 = s3.replaceFirst("tea","cola");  // i like to drink cola and tea
        System.out.println(s3);

        String s4 = "I like to Watch Game of thrones, and Walking dead";
               s4 = s4.replace(", and Walking dead","");//I like to Watch Game of thrones
        System.out.println(s4);
        System.out.println("======================================================");

        //indexOf()
        String s5 = "I like to stay in Cybertek, we are learning java";
        int r1 = s5.indexOf("r"); //returns the first char 'r' index.
        System.out.println(r1);
        System.out.println(s5.charAt(r1));//use charAt(r1)verify index number is 'r'.

        int r2 = s5.indexOf("re");
        int r3 = s5.indexOf("rn");
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("======================================================");

        ///lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("Java is fun")  ;
        int I2 = s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";
        int a1 = s7.indexOf("A");// return negative number -1.
        System.out.println(a1);

        String s8 = "Java";
        int a = s8.indexOf("v");
        System.out.println(a);

       //if use double line 68 is ok but next step is error,double can not cast char
       //  double a=s8.indexOf("a");
       // char ch = s8.charAt(a);

    }
}
