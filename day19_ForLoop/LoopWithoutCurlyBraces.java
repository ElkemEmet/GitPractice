package day19_ForLoop;

public class LoopWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
            System.out.println("How are you");

        }

        System.out.println("=======================");

        for(int i =1;i<=5;i++)// without {}.do not used,but still working
            System.out.println("Hello");
            System.out.println("How are you");



    }
}