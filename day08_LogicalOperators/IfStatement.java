package day08_LogicalOperators;

import javax.xml.bind.SchemaOutputResolver;

public class IfStatement {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;
        if(a>b)  {
            System.out.println(a +" is the max number");
        }

        if(b>a){
            System.out.println(b +" is the max number");
        }

        if (a == b){
            System.out.println("Both are equal");


            System.out.println("===========================");
            boolean BreakTime = true;

            if(BreakTime){
                System.out.println("Take 15 minutes break!");
            }
            if(BreakTime == false){
                System.out.println("keep studying");
            }

            System.out.println("=====================");

            boolean Corona = true;
            if(Corona == true){
                System.out.println("Stay at home");
                System.out.println("Social Distance") ;
            }


















        }
    }
}
