package day28_Recap;
//1. write a program return the frequency of a word from a string

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "javajajajajajavavavavava";  //"java"

        int count = 0;
        for(int i =0; i<=str.length()-4; i++){ //i:0,1,2,,3,4,5,6,7

            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
        }

        System.out.println(count);



    }
}
