package curs06_collections.Leaders;


import java.util.*;

public class Main {
      static int maxVal;
      static List liders = new ArrayList<Integer>();

    public static void main(String[] args) {
        List integers = new ArrayList<Integer>() ;
        integers.add(1);
        integers.add(7);
        integers.add(5);
        integers.add(14);
        integers.add(9);

        Iterator<Integer> it = integers.iterator();

        Collections.reverse(integers);
        if(it.hasNext()){
            maxVal = it.next();
            liders.add(maxVal);
        }
        while( it.hasNext()){
            int currentElement = it.next();
            if( currentElement > maxVal ){
                maxVal = currentElement;
                liders.add(maxVal);
            }
        }

        System.out.println(liders);
    }
}
