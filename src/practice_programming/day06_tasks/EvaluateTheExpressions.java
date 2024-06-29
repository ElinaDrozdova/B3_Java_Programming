package practice_programming.day06_tasks;

public class EvaluateTheExpressions {
    public static void main(String[] args) {
        //Task 1
        int x = 2 + 3 * 2 / 1; //8
        int y = ( 2 + 3 ) * 2; //10
        int w = 78 / 2 * 2 + 3 - 5 % 5; //81
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2; //17

        int a = 1;
        int b = -a-- + a++ / -a-- * --a; //-1
        int A = 50;
        int B = --A + A++ + A-- + A++; //197
        int X = 4;
        int Y = X * 4 - X++; //12
        int t = 100;
        int p = - ++t * -t-- / t++ + --t; //202
        int R = 20;

        int W = -R-- + -R++ + --R * R-- % 2; // -38
        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2; // 700

        System.out.println(x);
        System.out.println(y);
        System.out.println(w);
        System.out.println(i);
        System.out.println(b);
        System.out.println(B);
        System.out.println(Y);
        System.out.println(p);
        System.out.println(W);
        System.out.println(U);
    }
}
