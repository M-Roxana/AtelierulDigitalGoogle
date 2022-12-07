package patterns.ch2_strategy;
import java.util.Arrays;

public class DisplaySorted {

    public void displaySorted(SortingStrategy strategy, Integer[] arr){
     strategy.sort(arr);
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7,9,3,6,4,5,2,8,1};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        DisplaySorted sort = new DisplaySorted();
        sort.displaySorted(new BubbleSort(), copy01OfArr);
        System.out.println();
        sort.displaySorted(new MergeSort(), copy02OfArr);
    }

}
