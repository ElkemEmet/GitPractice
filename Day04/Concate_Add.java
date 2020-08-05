package Day04;

public class Concate_Add {
    public static void main(String[] args) {
        //addition:number + number
        System.out.println(12 + 13);//25
        System.out.println('A' + 2);//char still is a number so = 65+2 ==67
        System.out.println('A' + 'B');// 2 char still output number ,still is addition ==131

        // Concatenation : append

        System.out.println("12" + 13);//1213
        System.out.println("A" + 2);//A2
        System.out.println("Gender: " + 'M');//Gender: M
        System.out.println("Tax: " +3.5+'%');//Tax:3.5%   concatenation
        System.out.println(3.5+'%'+" Tax");//40.5 Tax     first add then concatenation






    }
}
