package Curs06_Collections.Ch2_PascalsTriangle;

public class Factorial {

    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}
