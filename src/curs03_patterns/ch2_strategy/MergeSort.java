package curs03_patterns.ch2_strategy;

public class MergeSort implements SortingStrategy{

    void merge(Integer a[], int beg, int mid, int end)
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

     void sortMerge(Integer[] a,  int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sortMerge(a, l, m);
            sortMerge(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    @Override
    public void sort( Integer[] lista){
        int l = 0;
        int r = lista.length-1;
        sortMerge(lista, l, r);

        for( int i = 0; i<lista.length; i++)
            System.out.print(lista[i] + " ");
    }
}
