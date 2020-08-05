package day07_Unary_ShortHand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

public class Quiz {
    public static void main(String[] args) {
        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

      //  iNum = fNum;
          //fNUM = iNum;
          dNum = fNum;
        //fNum = dNum;

        System.out.println("Result A" + 0 + 1);

        System.out.println("Result B" + (1) + (2));
        System.out.println("Result B" + (1 + 2));

        System.out.println("5 + 2 = " + 3+4);
        System.out.println("5 + 2 = " + (3+4));





    }
}
