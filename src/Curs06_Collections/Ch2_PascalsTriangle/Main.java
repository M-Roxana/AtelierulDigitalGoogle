package Curs06_Collections.Ch2_PascalsTriangle;

public class Main {

    public static void main(String[] args) {
        int n = 4, i, j;
        Factorial f = new Factorial();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + f.factorial(i) / (f.factorial(i - j) * f.factorial(j)));
            }
            System.out.println();
        }
    }
}
