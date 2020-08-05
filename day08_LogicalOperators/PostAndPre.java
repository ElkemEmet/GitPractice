package day08_LogicalOperators;

public class PostAndPre {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y ;//  int x /y == 0;
        System.out.println(z);

    }
}
