package day09_IfStatement;

//write a java program that can identify if a person is eligible to buy alcohol

public class alcohol {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 28;

        boolean eligible = hasID && age >= 21;

        String result ="";

        if(eligible==true){
          //  System.out.println("Eligible to buy alcohol");
            result ="Eligible to buy alcohol";
        }

        if(eligible==false){
          //  System.out.println("Go buy milk");
            result = "Your are not old enough to buy alcohol";
        }

        System.out.println(result);



    }
}
