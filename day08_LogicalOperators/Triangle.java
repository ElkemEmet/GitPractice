package day08_LogicalOperators;

public class Triangle {

    public static void main(String[] args) {
        double angele1 = 200;
        double angele2 = 60;
        double angels3 = 20;

        boolean valid = angele1+angele2+angels3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }

        if(invalid){
            System.out.println("invalid Triangle");
        }






    }
}
