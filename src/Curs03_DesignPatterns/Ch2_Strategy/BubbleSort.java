package Curs03_DesignPatterns.Ch2_Strategy;

public class BubbleSort implements SortingStrategy{

    @Override
    public void sort( Integer[] lista){
      int n = lista.length;
      int temp = 0;
      for(int i=0; i<n; i++){
          for(int j = 1; j<(n-i); j++){
              if(lista[j-1] > lista[j]){
                  temp = lista[j-1];
                  lista[j-1] = lista[j];
                  lista[j] = temp;
              }
          }
      }

      for(int i=0; i<n; i++){
          System.out.print(lista[i]+ " ");
      }
    }
}
