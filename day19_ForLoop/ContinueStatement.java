package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){// i:1,2,3,4,5
             if(i == 3){
                 continue;// when true jumps to the next iteration i==4;
             }

            System.out.print(i+" ");// 1 2 4 5

        }
            System.out.println();
            System.out.println("=======================");

        for(char ch ='A'; ch<='F'; ch++){// A B C D E F

            if(ch =='C' || ch == 'F'){
                continue;
                //break;  just print: A B
            }

            System.out.print(ch + " ");
        }

            System.out.println();



    }
}
