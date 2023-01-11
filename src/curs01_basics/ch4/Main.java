package curs01_basics.ch4;

public class Main {
    static int nr = 0;
    static int counter = 0;

    private static Pair3[] createPairs(int[] newArray) {
        counter = 0;
        nr = newArray.length;
        Pair3[] pairs = new Pair3[nr];
        for (int i = 0; i < nr; i++) {
            for (int j = i + 1; j < nr; j++) {
                for (int k = j + 1; k < nr; k++) {
                    if (newArray[i] + newArray[j] + newArray[k] == 0) {
                        pairs[counter++] = new Pair3(newArray[i], newArray[j], newArray[k]);
                        System.out.println(pairs[counter - 1]);
                        break;
                    }
                }break;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{ -1, -1, 1 ,9, 8, 4, -3, 0, -1, -1};

        for(int i = 0; i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("");
        createPairs(myArray);

        System.out.println("Number of pairs " + counter);
    }
}
