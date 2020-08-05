package day10_IfStatements;
/*grade:
        90 ~ 100 ==> A
        80 ~ 89 ==> B
        70 ~ 79 ==> C
        60 ~ 69 ==> D
        otherwise ==> F
         score<0 || score>100 ====>invalid score
         */

public class GradeCalculator {

    public static void main(String[] args) {

        int score = 90;
        String grade ="";

        if(score >=90 && score <=100){
            grade = "A";
        }else if(score >=80 && score <=89){
            grade="B";
        }else if(score >=70 && score <=79) {
            grade = "C";
        }else if(score >=60 && score <=69) {
            grade = "D";
        }else if(score >=0 && score <=9){
            grade="You made F";
        }else{
            grade="invalid score";
        }

        System.out.println(grade);
        }
}

