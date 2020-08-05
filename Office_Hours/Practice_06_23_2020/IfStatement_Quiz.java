package Office_Hours.Practice_06_23_2020;

public class IfStatement_Quiz {
    public static void main(String[] args) {
        int score=0;

        if (score ==0){
            //0==0==>true
            score+=50;    //score=score + 50;
        }

            if(score !=0) {
                //50 != 0 ==>true
                score += 50;//score=100;
            }
                System.out.println(score);
                System.out.println("=====================");

                //q3:

                char grade ='A';
                boolean passed = grade =='A' || grade == 'B'; // "||" is  one true is enough.

                boolean passed2= grade == 'C' || grade=='D';// "||" have to check to side.

                if(passed || passed2){//true || false ==>true  this is for ||.
                    System.out.println("Passed");
                }else{
                    System.out.println("failed");
                }

        System.out.println("======================");

                //q9:

                boolean x=true;
                boolean y  =   !x==false;
                // false == false ==>true
                boolean z= y;



                //q10:

                int X =10;
                int Y=X++;//y=10,X=11
























            }
    }




