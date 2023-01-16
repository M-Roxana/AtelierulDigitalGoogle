package Curs06_Collections.Ch4_ZigZag;

import java.util.Arrays;

public class Zigzag {

        public static void zigZag(int arr[])
        {
            boolean flag = true;
            int aux =0;
            for (int i=0; i<=arr.length-2; i++) {
                if (flag) {
                    if (arr[i] > arr[i+1]) {
                        aux = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = aux;
                    }
                } else {
                    if (arr[i] < arr[i+1]){
                        aux = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = aux;
                    }
                }
                if(flag==true)
                    flag=false;
                else
                    flag=true;
            }
        }
        public static void main(String args[])
        {
            int arr[] = {4, 3, 7, 8, 6, 1, 1};
            zigZag(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

