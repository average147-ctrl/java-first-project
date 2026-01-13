public class MaxOf3Num {
    int a;
    int b;
    int c;

    void findMax (int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println( a);
        } else if (b > c) {
            System.out.println( b);

        } else {
            System.out.println( c);
        }