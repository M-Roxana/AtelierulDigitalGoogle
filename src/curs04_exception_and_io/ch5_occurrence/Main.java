package curs04_exception_and_io.ch5_occurrence;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        occurrence("./src/curs04_exception_and_io/ch5_occurrence/text.txt");
    }
    public static void occurrence(String fromFilename) {
        String word, textWord;
        Map<String,Integer> mp = new TreeMap<>();
        Map<String,Integer> orderedMp = new TreeMap<>();
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(fromFilename)));
            while (scanner.hasNext()) {
                textWord = scanner.next();
                word = textWord.toLowerCase();
                if (mp.containsKey(word)) {
                    mp.put(word, mp.get(word) + 1);
                } else {
                    mp.put(word, 1);
                }
            }
                System.out.println(mp);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
