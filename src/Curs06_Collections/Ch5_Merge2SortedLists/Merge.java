package Curs06_Collections.Ch5_Merge2SortedLists;

import java.util.*;

public class Merge {

    public static List<Integer> mergeSortedLists (List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 5, 6, 7, 8, 9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2, 3, 4));
        System.out.println(mergeSortedLists(l1, l2));
    }

}