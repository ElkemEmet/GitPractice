package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays2 {

    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        char[] a3 = new char[ a1.length+a2.length ];       // {A, B, C,D, D, E, F}

        int index = 0;

        for( int i =0; i <= a1.length-1; i++){
            a3[index] = a1[i];
            index++;
        }

        for( int j =0; j <= a2.length-1; j++){  // starting and ending point is prefer use for for loop
            a3[index] = a2[j];
            index++;
        }


        System.out.println(Arrays.toString(a3));
    }
}