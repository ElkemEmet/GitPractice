package day10_IfStatements;
//write a program that can identify if the given character character is Alphabetic

public class Character_Identify {

    public static void main(String[] args) {

        char character ='A';

        boolean isAlphabetic =(character>=65 && character <=90) || (character >=97 && character <=122);

        boolean isDigit = character >=48 && character <=57;

        boolean specialChar = !isAlphabetic && !isDigit;



        String alphabet=""; //new way
        if(isAlphabetic) {
          //  System.out.println(character + " is Alphabetic"); // another way
            alphabet = character + " is Alphabetic"; // new way
        }else {
           // System.out.println(character + " is not Alphabetic character"); //another way
            alphabet = character + " is not Alphabetic character"; // new way
        }
        System.out.println(alphabet); // new way


        String digit ="";
        if(isDigit==true){
            digit = character+" is a digit";
        }else{
            digit = character+ " is a not digit";
        }
        System.out.println(digit);



        String specialCharacter ="";
        if(specialChar ==true){
            specialCharacter = character+ " is a special char";
        }else{
            specialCharacter= character+" is a not special char";
        }
        System.out.println(specialCharacter);

    }
}
