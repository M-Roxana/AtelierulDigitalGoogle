package Curs06_Collections.Ch3_CellsTriangle;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class BellsTriangle {

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));
        for (int i = 1; i < n; i++) {
            List<Integer> rowFromAbove = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(rowFromAbove.get(i - 1));
            for (int j = 1; j <= i; j++) {
                currentRow.add(currentRow.get(j - 1) + rowFromAbove.get(j - 1));
            }
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = generate(5);
        for (List<Integer> row : triangle) {
            for (Integer cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

